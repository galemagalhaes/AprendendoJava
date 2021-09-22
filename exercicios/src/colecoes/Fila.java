package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		// add e offer se comportam diferente quando a lista está cheia
		// add adiciona, mas se a fila estiver cheia gera erro
		// offer adiciona e se a fila estiver cheia retorna falso sem gerar erro
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Danilo");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// peek e element se comportam diferente quando a lista está vezia
		// peek retorna primeiro da fila sem remover, se a lista estiver vazia o retorna
		// null
		// element retorna o primeiro e se a fila estiver vazia gera erro
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// poll e remove obtem o proximo elemento da fila e remove
		// poll -> quando a fila estiver vazia retorna null
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		// System.out.println(fila.poll());
		// System.out.println(fila.poll());

		// remove -> quando a lista estiver vazia gera erro
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();
	}

}
