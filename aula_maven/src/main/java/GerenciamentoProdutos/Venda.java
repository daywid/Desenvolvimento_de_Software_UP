package GerenciamentoProdutos;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    public List<Produto> produtosVendidos; 

    public Venda() {
        produtosVendidos = new ArrayList<>();
    }

    public void adicionarProdutoVendido(Produto produto){
        produtosVendidos.add(produto);
    }

    public double calcularValorTotalVenda(){
        double valorTotal = 0;
        for (Produto produto: produtosVendidos){
            valorTotal += produto.preco;
        }
        return valorTotal;
    }

    public void imprimirDetalhesVenda(){
        System.out.println("Produtos vendidos:");
        for (Produto produto: produtosVendidos){
            System.out.println(produto.nome + "-" + produto.codigo);
        }
        System.out.println("Valor total da venda: " + calcularValorTotalVenda());
    }

}
