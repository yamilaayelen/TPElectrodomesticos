package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tp.*;

public class CatalogoLavarropas {
	
	public ArrayList<Lavarropas> getLavarropas()
	{
		ArrayList<Lavarropas> lavas= new ArrayList<Lavarropas>();
		
		//String sql="select * from lavarropas";
		//Statement sentencia=null;
		//ResultSet rs=null;
		
		//try {			
			/*sentencia= DataConnectionManager.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next()){
				Lavarropas lav= new Lavarropas();
				lav.setDescrip(rs.getString("descrip"));
				lav.setPrecioBase(rs.getFloat("precio_base"));
				lav.setColor(rs.getString("color"));
				lav.setPeso(rs.getFloat("peso"));
				lav.setConsumoEnergetico(rs.getString("consumo_energetico"));
				lav.setCarga(rs.getInt("carga"));
				
				lavas.add(lav);
						
			}	*/
			Lavarropas lav=new Lavarropas();
			lav.setDescrip("lava1");
			lav.setCarga(45);
			lav.setColor("blanco");
			lav.setConsumoEnergetico("A");
			lav.setPeso(45);
			lav.setPrecioBase(3000);
			
			Lavarropas lav2 = new Lavarropas();
			lav2.setDescrip("lava2");
			lav2.setCarga(55);
			lav2.setColor("negro");
			lav2.setConsumoEnergetico("C");
			lav2.setPeso(55);
			lav2.setPrecioBase(5050);
			
			Lavarropas lav3 = new Lavarropas();
			lav3.setDescrip("lava3");
			lav3.setCarga(60);
			lav3.setColor("negro");
			lav3.setConsumoEnergetico("A");
			lav3.setPeso(40);
			lav3.setPrecioBase(3500);
			
			lavas.add(lav);
			lavas.add(lav2);
			lavas.add(lav3);
			
		
		/*catch (SQLException e) {
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
		*/
		
		return lavas;
	}
	
	
	public Lavarropas getLavarropasByDescripcion(String Descripcion){
		
		
		String sql="select * from lavarropas where descrip= Descripcion";
	
		PreparedStatement sentencia=null;
		ResultSet rs=null;
		Lavarropas lav=null;
		
		try {			
			sentencia= DataConnectionManager.getInstancia().getConn().prepareStatement(sql);
			sentencia.setString(1, Descripcion);
			rs= sentencia.executeQuery();
			
			if(rs.next()){
				lav= new Lavarropas();
				lav.setDescrip(rs.getString("descrip"));
				lav.setPrecioBase(rs.getFloat("precio_base"));
				lav.setColor(rs.getString("color"));
				lav.setPeso(rs.getFloat("peso"));
				lav.setConsumoEnergetico(rs.getString("consumo_energetico"));
				lav.setCarga(rs.getInt("carga"));
				
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
		return lav;
	}

	
	public void addLavarropas(Lavarropas nuevoLav){
		
		String sql="insert into lavarropas(descrip, precio_base, color, peso, consumo_energetico, carga) values (?,?,?,?,?,?)";
		PreparedStatement sentencia=null;
		Connection conn=DataConnectionManager.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, nuevoLav.getDescrip());
			sentencia.setFloat(2, nuevoLav.getPrecioBase());
			sentencia.setString(3, nuevoLav.getColor());
			sentencia.setFloat(4, nuevoLav.getPeso());
			sentencia.setString(5, nuevoLav.getConsumoEnergetico());
			sentencia.setInt(6, nuevoLav.getCarga());
			
			int filasAfectadas=sentencia.executeUpdate();
			
			ResultSet cps= sentencia.getGeneratedKeys();
			if(cps.next()){
				String lavDes=cps.getString(1);
				nuevoLav.setDescrip(lavDes);
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
              
    public void Update(String desc, String descripcion, float precio, String color, String consumo, float peso, int carga)
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
			sentencia.setFloat(5, peso);
			sentencia.setInt(6, carga);
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