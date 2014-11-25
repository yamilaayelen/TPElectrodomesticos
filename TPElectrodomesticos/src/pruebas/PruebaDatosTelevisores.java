package pruebas;

import tp.*;
import datos.*;

public class PruebaDatosTelevisores {
	
	public static void main(String[] args) 
	{
	
	CatalogoTelevisores catTel=new datos.CatalogoTelevisores();
	
	tp.Television nt= nuevoTelevisor();
	System.out.println("Descripcion: "+(nt.getDescrip()));
	System.out.println("Precio Base: "+Float.toString(nt.getPrecioBase()));
	System.out.println("Color: "+(nt.getColor()));
	System.out.println("Consumo Energetico: "+(nt.getConsumoEnergetico()));
	System.out.println("Peso: "+Float.toString(nt.getPeso()));
	//System.out.println("Resolucion: "+ Integer.toString(nt.getResolucion()));
	System.out.println("Sintonizador: "+Boolean.toString(nt.getSintonizadorTDT()));
	catTel.addTelevision(nt);
	
	
	for (tp.Television t : catTel.getTelevisores()) 
	{
		printTelevisores(t);
	}
	
	tp.Television tel=catTel.getTelevisoresByDescripcion("Tele1");
	printTelevisores(tel);
	
	}

	private static tp.Television nuevoTelevisor()
	{
		tp.Television t=new Television();
		t.setDescrip("Lava1");
		t.setPrecioBase(12);
		t.setColor("Blanco");
		//l.setConsumoEnergetico("A");
		t.setPeso(12);
		t.setResolucion(40);
		t.setSintonizadorTDT(true);
		return t;
	}

	private static void printTelevisores(tp.Television t)
	{
		if(t!=null)
		{
			String Tel="";
			Tel+=(t.getDescrip())+"\t";
			Tel+=Float.toString(t.getPrecioBase())+"\t";
			Tel+=t.getColor();
			Tel+=t.getConsumoEnergetico();
			Tel+=Float.toString(t.getPeso())+"\t";
			Tel+=Float.toString(t.getResolucion())+"\t";
			Tel+=Boolean.toString(t.getSintonizadorTDT())+"\t";
		
			System.out.println(Tel);
		}
		else
		{
			System.out.println("Televisor Inexistente");
		}
	}

}
