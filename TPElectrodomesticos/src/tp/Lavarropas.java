package tp;

public class Lavarropas extends Electrodomestico
{
	private int carga;

	
	
	
	
	public float getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getDescrip() {
		return descrip;
	}



	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}



	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}



	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}



	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}

	public Lavarropas()	// por defecto
	{
		super();
		this.carga=5;
	}
	
	public Lavarropas(float precioBaseI, float pesoI)	//peso precio ingresa, el resto por defecto
	{
		super(precioBaseI, pesoI);				
		this.carga=5;
	}
	
	public Lavarropas(int cargaI)	//carga ingresa, el resto heredados del electrodomestico
	{
		super();					//llama al constructor de la clase Electrodomesticos
		this.carga=cargaI;
	}
	
	
	public float precioFinal(int carga)
	{
		float precioLavarropa;
		
			if(carga > 30)
				precioLavarropa = super.precioFinal(consumoEnergetico, peso) + 50;
			else
				precioLavarropa = super.precioFinal(consumoEnergetico, peso);
			
		return precioLavarropa;
	}
}
