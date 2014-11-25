package pruebas;

import tp.*;
import datos.*;

public class PruebaDatosLavarropas {
	
	public static void main(String[] args) 
	{
	
	CatalogoLavarropas catLav=new datos.CatalogoLavarropas();
	
	tp.Lavarropas nl= nuevoLavarropas();
	System.out.println("Descripcion: "+(nl.getDescrip()));
	System.out.println("Precio Base: "+Float.toString(nl.getPrecioBase()));
	System.out.println("Color: "+(nl.getColor()));
	System.out.println("Consumo Energetico: "+(nl.getConsumoEnergetico()));
	System.out.println("Peso: "+Float.toString(nl.getPeso()));
	System.out.println("Carga: "+Integer.toString(nl.getCarga()));
	catLav.addLavarropas(nl);
	
	
	for (tp.Lavarropas l : catLav.getLavarropas()) 
	{
		printLavarropas(l);
	}
	
	tp.Lavarropas lav=catLav.getLavarropasByDescripcion("Lava1");
	printLavarropas(lav);
	
	}

	private static tp.Lavarropas nuevoLavarropas()
	{
		tp.Lavarropas l=new Lavarropas();
		l.setDescrip("Lava1");
		l.setPrecioBase(12);
		l.setColor("Blanco");
		//l.setConsumoEnergetico("A");
		l.setPeso(12);
		l.setCarga(45);
		return l;
	}

	private static void printLavarropas(tp.Lavarropas l)
	{
		if(l!=null)
		{
			String Lav="";
			Lav+=(l.getDescrip())+"\t";
			Lav+=Float.toString(l.getPrecioBase())+"\t";
			Lav+=l.getColor();
			Lav+=l.getConsumoEnergetico();
			Lav+=Float.toString(l.getPeso())+"\t";
			Lav+=Integer.toString(l.getCarga())+"\t";
			System.out.println(Lav);
		}
		else
		{
			System.out.println("Lavarropa Inexistente");
		}
	}
}
