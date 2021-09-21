package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Notebook", 4356.89);		
		
		
		var prod2 = new Produto();
		prod2.nome = "Caneta Preta";
		prod2.preco = 12.56;
		Produto.desconto = 0.50;
		
		System.out.println(prod1.nome + " " + prod1.precoComDesconto());
		System.out.println(prod2.nome + " " + prod2.precoComDesconto());
		
		double precoFinal1 = prod1.precoComDesconto(0);
		double precoFinal2 = prod2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
