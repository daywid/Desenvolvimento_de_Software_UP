package GerenciamentoVeiculos;

import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar o estoque de veículos
public class EstoqueVeiculos implements Armazenamento {
    private List<Veiculo> veiculosEmEstoque;

    public EstoqueVeiculos() {
        this.veiculosEmEstoque = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosEmEstoque.add(veiculo);
    }

    @Override
    public List<Veiculo> recuperarVeiculosEmEstoque() {
        return veiculosEmEstoque;
    }
}
