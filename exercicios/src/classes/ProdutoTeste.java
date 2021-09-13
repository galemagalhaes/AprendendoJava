package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto prod1 = new Produto();
		prod1.nome = "Notebook";
		prod1.preco = 4356.89;
		prod1.desconto = 0.25;
		
		var prod2 = new Produto();
		prod2.nome = "Caneta Preta";
		prod2.preco = 12.56;
		prod2.desconto = 0.29;
		
		System.out.println(prod1.nome);
		System.out.println(prod2.nome);
		
		double precoFinal1 = prod1.preco * (1 - prod1.desconto);
		double precoFinal2 = prod2.preco * (1 - prod2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
