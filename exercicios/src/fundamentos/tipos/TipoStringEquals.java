package fundamentos.tipos;

import java.util.Scanner;

public class TipoStringEquals 
{
	public static void main(String[] args) 
	{
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //next já tira espaços em branco
		System.out.println("2" == s2.trim()); //digitar com espaços
		System.out.println("2".equals(s2.trim())); //sempre que for comparar string o melhor é usar equals e não ==
		
		entrada.close();
	}

}
