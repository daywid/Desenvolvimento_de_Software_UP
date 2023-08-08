package GerenciamentoProdutos;

public class Produto {
    int codigo;
    String nome;
    double preco;
    int quantidadeEstoque;

    public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorTotal(){
        double valorTotal = preco*quantidadeEstoque;
        return valorTotal;
    }

}
