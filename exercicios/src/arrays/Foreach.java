package arrays;

public class Foreach {
// foreach é uma estrutura de controle muito usada em arrays e collections
	public static void main(String[] args) {
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		//em java não se escreve foreach e sim for com outra estrutura		
		for(double nota: notas) { //a variável "nota" recebe cada elemento de "notas"
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		//o laço "for" dá o mesmo resultado
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
			
			//a diferença do foreach é que ele não precisa de um indice, não precisa
			//se preocurar com o tamanho do array para percorre-lo.
		}
	}	
}
