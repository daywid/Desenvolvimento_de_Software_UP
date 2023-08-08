package GerenciamentoProdutos;

import java.util.ArrayList;

public class Estoque {

    public ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Estoque() {
        produtos = new ArrayList<>();
    }
	
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public Produto buscarProdutoPorCodigo(int codigo){

        for (Produto produto : produtos) {
            if(produto.codigo == codigo){
            return produto;
            }
        }
        return null;
    }
	
}
