package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		//aqui pode usar "List" ou "ArrayList"
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");  //objeto é criado e depois passado p lista
		lista.add(u1);
		
		lista.add(new Usuario("Carlos")); //objeto criado e passado p lista ao mesmo tempo
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //acessar pelo índice
		
		System.out.println("Removido >>>> " + lista.remove(1));
		System.out.println("Removido? T/F : " + lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem ? T/F : " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}

/* O equals e hashcode da classe usuário foi gerado automaticamente pela IDE
 * Mas no caso da lista usa apenas o equals, o hashcode pe necessario para o uso
 * dos metodos hashSet ou hashMap, por exemplo */
 