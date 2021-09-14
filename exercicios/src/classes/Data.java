package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//essa forma é melhor!!!
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	}
	
}
