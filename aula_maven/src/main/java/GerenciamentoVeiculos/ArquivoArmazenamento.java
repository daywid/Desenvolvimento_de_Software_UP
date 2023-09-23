package GerenciamentoVeiculos;

public class ArquivoArmazenamento implements Armazenamento {
    private List<Veiculo> bancoDeDados = new ArrayList<>();

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        bancoDeDados.add(veiculo);
        // Implemente aqui a lógica de inserção no banco de dados real
    }

    @Override
    public List<Veiculo> recuperarVeiculosEmEstoque() {
        // Implemente aqui a lógica de consulta ao banco de dados real
        return bancoDeDados;
    }
}