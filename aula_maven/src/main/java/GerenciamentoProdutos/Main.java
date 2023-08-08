package GerenciamentoProdutos;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto(1, "Camiseta", 29.99, 50);
        Produto produto2 = new Produto(2, "Calça Jeans", 59.99, 30);

        // Adicionando produtos ao estoque
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        // Criando uma venda
        Venda venda1 = new Venda();
        venda1.adicionarProdutoVendido(produto1);
        venda1.adicionarProdutoVendido(produto2);

        // Registrando a venda
        GerenciadorVendas gerenciadorVendas = new GerenciadorVendas();
        gerenciadorVendas.registrarVenda(venda1);

        // Imprimindo os detalhes da venda
        venda1.imprimirDetalhesVenda();

        // Buscando um produto no estoque
        Produto produtoEncontrado = estoque.buscarProdutoPorCodigo(1);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.nome);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
