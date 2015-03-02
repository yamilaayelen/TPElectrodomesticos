package tp;
import datos.*;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import datos.CatalogoLavarropas;


public class Principal 
{
	static ArrayList<Lavarropas> lavarropas = new ArrayList<Lavarropas>();
	static ArrayList<Television> televisores = new ArrayList<Television>();
	static ArrayList<Television> listaTeles = new ArrayList<Television>();
	static ArrayList<Lavarropas> listaLavas = new ArrayList<Lavarropas>();
	
	static ArrayList<Lavarropas> lista = new ArrayList<Lavarropas>();
	
	public static void AltaLavarropas(String descripcionAL, String precioBaseAL, String pesoAL, String cargaAL, String colorAL, String consumoAL)
	{
		Lavarropas lava;
			
		lava = new Lavarropas();
		
		lava.setDescrip(descripcionAL);
		lava.setPrecioBase(Float.parseFloat(precioBaseAL));
		lava.setPeso(Float.parseFloat(pesoAL));
		lava.setCarga(Integer.parseInt(cargaAL));
		lava.setColor(colorAL);
		lava.setConsumoEnergetico(consumoAL);		
	
		lavarropas.add(lava);
		
		CatalogoLavarropas cat = new CatalogoLavarropas();
		cat.addLavarropas(lava);
		
	}

	public static void AltaTelevision(String descripcionAT, String precioBaseAT, String pesoAT, String colorAT, String consumoAT, String resolucionAT, String sintonizadorAT)
	{
		Television tele;
		
		tele = new Television();
		
		tele.setDescrip(descripcionAT);
		tele.setPrecioBase(Float.parseFloat(precioBaseAT));
		tele.setPeso(Float.parseFloat(pesoAT));
		tele.setColor(colorAT);
		tele.setConsumoEnergetico(consumoAT);
		tele.setResolucion(Integer.parseInt(resolucionAT));
		tele.setSintonizadorTDT(Boolean.valueOf(sintonizadorAT));
		
		televisores.add(tele);
	}

	public static Lavarropas BuscaLava(String desc)
	{
		Lavarropas lava = null;
		
		for(int i=0; i<lavarropas.size();)
		{
			if(lavarropas.get(i).getDescrip().equalsIgnoreCase(desc))
				lava=lavarropas.get(i);
				break;
		}
		return lava;
	}
	
	public static Television BuscaTele(String desc)
	{
		Television tele=null;
		
		for(int i=0; i<televisores.size();)
		{
			if(televisores.get(i).getDescrip().equals(desc) == true)
				tele=televisores.get(i);
				break;						
		}
		return tele;
	}
	
	
	public static int bajaLava(String descripET)
	{
		int b=0;
		for(int i=0; i<lavarropas.size();i++)
		{
			if(lavarropas.get(i).getDescrip().equals(descripET) == true)
				{
				lavarropas.remove(lavarropas.get(i));
				JOptionPane.showMessageDialog(null, "Lavarropa borrado");
				b=1;
				}
		}
		return b;
	}

	public static int bajaTele(String descripEL)
	{
		int b=0;
		for(int i=0; i<televisores.size();i++)
		{
			if(televisores.get(i).getDescrip().equals(descripEL) == true)
				{
				televisores.remove(i);
				JOptionPane.showMessageDialog(null, "Televisor borrado");
				b=1;
				break;
				}
		}
		return b;
	}
	
	public static ArrayList<Lavarropas> listaLava(float r1, float r2, String c)
	{
		for(int i=0; i<lavarropas.size();i++)
		{
			if(lavarropas.get(i).getPrecioBase() > r1 && lavarropas.get(i).getPrecioBase() < r2)
			{
				if(lavarropas.get(i).getConsumoEnergetico() == c) 
				{
					listaLavas.add(lavarropas.get(i));
				}
			}
		}
	
		Collections.sort(listaLavas);
		
		return listaLavas;
	}
	
	public static ArrayList<Television> listaTele(float r1, float r2, String c)
	{
		
		for(int i=0; i<televisores.size();i++)
		{
			if(televisores.get(i).getPrecioBase() > r1 && televisores.get(i).getPrecioBase() < r2)
			{
				if(televisores.get(i).getConsumoEnergetico() == c) 
				{
					listaTeles.add(televisores.get(i));
				}	
			}
		}

		Collections.sort(listaTeles);
		
		return listaTeles;
	}
	
	public static ArrayList<Lavarropas> lista()
	{
		for(int i=0; i<lavarropas.size();i++)
		{
			lista.add(lavarropas.get(i));
		}
		return lista;

	}
}
