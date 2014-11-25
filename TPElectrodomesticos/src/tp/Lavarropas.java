package tp;

public class Lavarropas extends Electrodomestico
{
	private int carga;
	
	
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
