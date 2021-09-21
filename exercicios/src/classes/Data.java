package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";  //essa constante � local
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
	//String formato = "%d/%d/%d"  ---- essa seria uma vari�vel de inst�ncia, 
	//podendo ser acessada em qualquer m�todo.
	
}
