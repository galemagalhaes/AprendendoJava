package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario ("Guilherme"));
		System.out.println(resultado);
	}

}
/* esse exemplo usa a classe Usuario, onde est� criado o hashcode
 * com esse hashcode o resultado aqui � true, se n�o tivesse esse hashcode 
 * o resultado aqui seria false */
 