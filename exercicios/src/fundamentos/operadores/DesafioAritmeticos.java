package fundamentos.operadores;

public class DesafioAritmeticos 
{
	public static void main(String[] args) 
	{
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		//exercicio
		
		var fator1 = (6 * (3 + 2));
		var d = (Math.pow(fator1, 2))/ (3 * 2);
				
		var fator3 = ((1 - 5) * (2 - 7))/2;
		var e = Math.pow(fator3, 2);
		
		var f = d - e;
		var g = (int)Math.pow(f, 3);
		var h = (int)Math.pow(10, 3);
		
		var resultado =  g / h;
		
		System.out.println(resultado);
		
		
		
		//Resolução do professor
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado2 = superior / inferior;
		
		System.out.println(resultado2);
	}

}
