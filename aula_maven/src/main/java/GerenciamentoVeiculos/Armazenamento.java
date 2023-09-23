package GerenciamentoVeiculos;

import java.util.List;

public interface Armazenamento {
    void adicionarVeiculo(Veiculo veiculo);
    void recuperarVeiculosEmEstoque();
}
