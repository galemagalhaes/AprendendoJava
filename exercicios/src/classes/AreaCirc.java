package classes;

public class AreaCirc {
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial){
		
		raio = raioInicial;
	}
	
	double area() {
		//return raio * raio * PI;
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
