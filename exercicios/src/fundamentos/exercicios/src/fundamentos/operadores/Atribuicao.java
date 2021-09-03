package fundamentos.operadores;

public class Atribuicao 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c += b; // c = c + b; atribuição aditiva
		c -= a; // c = c - a; atribuição subtrativa
		c *= b; // c = c * b; atribuição multiplicativa
		c /= a; // c = c / a; atribuição divisiva
		
		System.out.println(c);	
		
		c %= 2; // c = c % 2; 0 ou 1 atribuição modular
		System.out.println(c);
		
	}

}
