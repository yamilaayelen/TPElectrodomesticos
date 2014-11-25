package tp;

public class Electrodomestico implements Comparable<Electrodomestico>
{
	protected float precioBase, peso;
	protected String color, descrip, consumoEnergetico;

	public String getDescrip() {
		return descrip;
	}


	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


	public float getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Electrodomestico()	//por defecto
	{
		this.precioBase=100;
		this.color="blanco";
		this.consumoEnergetico="F";
		this.peso=5;
		this.descrip="electrodomestico";
	}
	
	public Electrodomestico(float precioBaseI, String colorI, String consumoEnergeticoI, float pesoI, String descripI)	//todos los atributos ingresados
	{
		this.precioBase=precioBaseI;
		this.color=colorI;
		this.consumoEnergetico=consumoEnergeticoI;
		this.peso=pesoI;
		this.descrip=descripI;
	}
	
	public Electrodomestico(float precioBaseI, float pesoI)	//peso precio ingresados, el resto por defecto
	{
		this.precioBase=precioBaseI;
		this.peso=pesoI;
		this.color="blanco";
		this.consumoEnergetico="F";
		this.descrip="electrodomestico";
	}
	
	public boolean comprobarConsumoEnergetico(String letra)
	{
		boolean b;
		
		if (letra.equals("A"))
			b=true;
		else if (letra.equals("B"))
			b=true;
		else if (letra.equals("C"))
			b=true;
		else if (letra.equals("D"))
			b=true;
		else if (letra.equals("E"))
			b=true;
		else b=false;
		
		return b;
	}
	
	public boolean comprobarColor(String color)
	{
		boolean b;
		
		if (color.equals("negro"))
			b=true;
		else if (color.equals("rojo"))
			b=true;
		else if (color.equals("azul"))
			b=true;
		else if (color.equals("gris"))
			b=true;
		else b=false;
		
		return b;
		
	}
	
	public float precioFinal(String consumoEnergetico, float peso)
	{
		float precioCE, precioT=0, precioTotal;
		
		if (consumoEnergetico.equals("A"))
			precioCE=100;
		else if (consumoEnergetico.equals("B"))
			precioCE=80;
		else if (consumoEnergetico.equals("C"))
			precioCE=60;
		else if (consumoEnergetico.equals("D"))
			precioCE=50;
		else if (consumoEnergetico.equals("E"))
			precioCE=30;
		else precioCE=10;
		
			
		if (peso >= 0 && peso <= 19 )
			precioT=10;
		else if (peso >= 20 && peso <= 49)
			precioT=50;
		else if (peso >= 50 && peso <= 79)
			precioT=80;
	
		precioTotal= precioCE + precioT;
		
		return precioTotal;
	}

	public String toString(){
		return this.getDescrip()+"\t"+String.valueOf(this.getPrecioBase());
	}
	
	public int compareTo(Electrodomestico e) {
		int res=this.getDescrip().compareTo(e.getDescrip());
		if (res==0){
			res=this.getDescrip().compareTo(e.getDescrip());
		}
		return res;
	}
}