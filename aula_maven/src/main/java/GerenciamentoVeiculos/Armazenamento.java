package GerenciamentoVeiculos;

import java.util.List;

public interface Armazenamento {
    void adicionarVeiculo(Veiculo veiculo);
    List<Veiculo> recuperarVeiculosEmEstoque();
}
