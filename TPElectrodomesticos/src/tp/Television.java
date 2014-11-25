package tp;

public class Television extends Electrodomestico
{
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	
	public float getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}


	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television()			//constructor por defecto
	{
		super();
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}
	
	public Television(float precioBaseI, float pesoI)	//peso precio ingresa, el resto por defecto
	{
		super(precioBaseI, pesoI);				
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}
	
	public Television(int resolucionI, boolean sintonizadorTDTI)			//ingresa resolucion, sintonizador el resto por defecto
	{
		super();
		this.resolucion=resolucionI;
		this.sintonizadorTDT=sintonizadorTDTI;
	}
	
	public float precioFinal(int resolucion, boolean sintonizadorTDT)				//ver si da bien los if
	{
		float precioTelevision, porcentaje, aumento;
		
		if(resolucion > 40)
			{	
			porcentaje = (float) (super.precioFinal(consumoEnergetico, peso)* 0.30);
			if(sintonizadorTDT = true)
				{
				aumento = 50;
				precioTelevision = super.precioFinal(consumoEnergetico, peso) + porcentaje + aumento;
				}
			else
				{
				precioTelevision = super.precioFinal(consumoEnergetico, peso) + porcentaje;
				}
			}
		else
			{
			precioTelevision = super.precioFinal(consumoEnergetico, peso);
			}
				
		return precioTelevision;
	}
	
}
