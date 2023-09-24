package GerenciamentoVeiculos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoArmazenamento implements Armazenamento {
    private String arquivoPath;

    public ArquivoArmazenamento(String arquivoPath) {
        this.arquivoPath = arquivoPath;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPath, true))) {
            String linha = veiculo.getMarca() + ";" + veiculo.getModelo() + ";" + veiculo.getAnoFabricacao() + ";" + veiculo.getPreco();
            writer.write(linha);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao adicionar veículo ao arquivo.");
        }
    }

    @Override
    public List<Veiculo> recuperarVeiculosEmEstoque() {
        List<Veiculo> veiculos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPath))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    String marca = partes[0];
                    String modelo = partes[1];
                    int anoFabricacao = Integer.parseInt(partes[2]);
                    double preco = Double.parseDouble(partes[3]);
                    veiculos.add(new Veiculo(marca, modelo, anoFabricacao, preco));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao recuperar veículos do arquivo.");
        }
        return veiculos;
    }
}
