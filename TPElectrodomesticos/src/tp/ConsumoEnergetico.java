package tp;

public class ConsumoEnergetico 
{
	static String[] consumos = {"A", "B", "C", "D", "E","F"};
	
	public static int validaConsumo(String consu)
	{
		int valida=0;
		for(int i=0; i<6;i++)
		{
			if (consumos.equals(consu) == true)
				{valida=1;
				break;}
			else
				valida=0;
		}
		return valida;
	}

}
