package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		double f = 120;		
		final double AJUSTE = 32;
		final double FATOR = (5.0/9.0);
		double c = ((f - AJUSTE) * FATOR);
		
		System.out.println(c + " ?C");
		
		f = 200;
		c = ((f - AJUSTE) * FATOR);
		System.out.println(" A temperatura ? " + c + " ?C");
	}

}
