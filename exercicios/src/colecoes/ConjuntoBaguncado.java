package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	// supressWarning "esconde" as advertencias nesse código
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> integer
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste");
		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste");
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("testes"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); //união dos conjuntos
		conjunto.retainAll(nums); // interseção de conjuntos
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}
}
