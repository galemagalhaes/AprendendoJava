package fundamentos.tipos;

public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		//informa??es do funcion?rio
		
		//tipos num?ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos num?rico reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_130.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //Ativo
		//s? cabe 1 caractere ou '\u0010' que significa um n?mero na tabela unicode
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 345);
		
		//N?mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F?rias? " + estaDeFerias);
		System.out.println("Status " + status);
	}

}
