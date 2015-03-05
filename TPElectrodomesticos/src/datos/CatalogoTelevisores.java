package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tp.*;

public class CatalogoTelevisores {
	
	public ArrayList<Television> getTelevisores(){
		ArrayList<Television> teles= new ArrayList<Television>();
		
		String sql="select * from televisores";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try {			
			sentencia= DataConnectionManager.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next()){
				Television tel= new Television();
				tel.setDescrip(rs.getString("Descripción"));
				tel.setPrecioBase(rs.getFloat("Precio Base"));
				tel.setColor(rs.getString("Color"));
				tel.setPeso(rs.getFloat("Peso"));
				tel.setConsumoEnergetico(rs.getString("ConsumoEnergetico"));
				
				teles.add(tel);
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null){rs.close();}
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				DataConnectionManager.getInstancia().CloseConn();
			}
			catch (SQLException sqle){
				sqle.printStackTrace();
			}
		}
		
		return teles;
	}
	
	
	public Television getTelevisoresByDescripcion(String Descripcion){
		
		
		String sql="select * from televisores where descrip= Descripcion";
	
		PreparedStatement sentencia=null;
		ResultSet rs=null;
		Television tel=null;
		
		try {			
			sentencia= DataConnectionManager.getInstancia().getConn().prepareStatement(sql);
			sentencia.setString(1, Descripcion);
			rs= sentencia.executeQuery();
			
			if(rs.next()){
				tel= new Television();
				tel.setDescrip(rs.getString("Descripción"));
				tel.setPrecioBase(rs.getFloat("Precio Base"));
				tel.setColor(rs.getString("Color"));
				tel.setPeso(rs.getFloat("Peso"));
				tel.setConsumoEnergetico(rs.getString("ConsumoEnergetico"));
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null){rs.close();}
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				DataConnectionManager.getInstancia().CloseConn();
			}
			catch (SQLException sqle){
				sqle.printStackTrace();
			}
		}
		return tel;
	}


	public void addTelevision(Television nuevoTel){
		
		String sql="insert into televisores(descrip, precioBase, color, peso, consumoEnergetico, resolucion, sintonizadorTDT) values (?,?)";
		PreparedStatement sentencia=null;
		Connection conn=DataConnectionManager.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, nuevoTel.getDescrip());
			sentencia.setFloat(2, nuevoTel.getPrecioBase());
			sentencia.setString(3, nuevoTel.getColor());
			sentencia.setFloat(4, nuevoTel.getPeso());
			sentencia.setString(5, nuevoTel.getConsumoEnergetico());
			sentencia.setFloat(6, nuevoTel.getResolucion());
			sentencia.setBoolean(7, nuevoTel.getSintonizadorTDT());
			
			int filasAfectadas=sentencia.executeUpdate();
			ResultSet cps= sentencia.getGeneratedKeys();
			if(cps.next()){
				String telDes=cps.getString(1);
				nuevoTel.setDescrip(telDes);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				DataConnectionManager.getInstancia().CloseConn();
			}
			catch (SQLException sqle){
				sqle.printStackTrace();
			}
			
		}
		
	}

	public void Delete(String descripcion)
    {
		String sql="delete from lavarropas where descrip = descripcion";
		PreparedStatement sentencia=null;
		
		try {			
			sentencia= DataConnectionManager.getInstancia().getConn().prepareStatement(sql);
			sentencia.setString(1, descripcion);
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				DataConnectionManager.getInstancia().CloseConn();
				}
			catch (SQLException sqle){
				sqle.printStackTrace();
				}
			}
    }
              
    public void Update(String desc, String descripcion, float precio, String color, String consumo, int resolucion, Boolean sintonizador)
    {
    	String sql = "update from lavarropas SET descrip=?, precio_base=?, color=?, consumo_energetico=?, peso=?, carga=? WHERE descrip=?";
    	PreparedStatement sentencia = null;
    	
    	try
    		{
    		sentencia= DataConnectionManager.getInstancia().getConn().prepareStatement(sql);
    		sentencia.setString(1, descripcion);
			sentencia.setFloat(2, precio);
			sentencia.setString(3, color);
			sentencia.setString(4, consumo);
			sentencia.setInt(5, resolucion);
			sentencia.setBoolean(6, sintonizador);
			sentencia.setString(7, desc);
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				DataConnectionManager.getInstancia().CloseConn();
				}
			catch (SQLException sqle){
				sqle.printStackTrace();
				}
			}
    	}
 
}
