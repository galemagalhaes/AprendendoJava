package fundamentos.tipos;



public class Wrappers 
{
	public static void main(String[] args) 
	{
				
		//byte
		Byte b = 100;
		Short s = 1000;
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //int
		Long l = 100000L; //long
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F; //precisa do F no final
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//ATENÇÃO alguns tipos primitivos tem "classes", ou melhor, 
		// tem wrapper com mesmo nome, como boolean e long, 
		//o jeito para diferenciar primitivos de wrappers,
		//é a letra inicial maiuscula para wrappers e 
		//minuscula para primitivos
		
		Character c = '#'; // char
		System.out.println(c + "...");
				
	}

}
