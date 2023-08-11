package Solid_aula2;

public class ProdutoComprado {
	public String nome;
	public int quantidade;
	public double preco;
	
	public ProdutoComprado(String nome, int quantidade,double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	public double CalcularTotal() {
		return quantidade * preco;
	}
}
