package arrays;

public class Foreach {
// foreach � uma estrutura de controle muito usada em arrays e collections
	public static void main(String[] args) {
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		//em java n�o se escreve foreach e sim for com outra estrutura		
		for(double nota: notas) { //a vari�vel "nota" recebe cada elemento de "notas"
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		//o la�o "for" d� o mesmo resultado
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
			
			//a diferen�a do foreach � que ele n�o precisa de um indice, n�o precisa
			//se preocurar com o tamanho do array para percorre-lo.
		}
	}	
}
