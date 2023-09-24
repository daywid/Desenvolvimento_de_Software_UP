package GerenciamentoVeiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosArmazenamento implements Armazenamento {
    private Connection connection;

    public BancoDeDadosArmazenamento() {
        try {

        
            // Configurações para a conexão com o banco de dados MySQL
            String url = "jdbc:mysql://localhost:3306/estacionamento";
            String usuario = "root";
            String senha = "root";
            
            // Estabelece a conexão com o banco de dados
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Não foi possível conectar ao banco de dados.");
        }
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO veiculos (marca, modelo, ano_fabricacao, preco) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, veiculo.getMarca());
            preparedStatement.setString(2, veiculo.getModelo());
            preparedStatement.setInt(3, veiculo.getAnoFabricacao());
            preparedStatement.setDouble(4, veiculo.getPreco());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao adicionar veículo no banco de dados.");
        }
    }

    @Override
    public List<Veiculo> recuperarVeiculosEmEstoque() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                int anoFabricacao = resultSet.getInt("ano_fabricacao");
                double preco = resultSet.getDouble("preco");
                veiculos.add(new Veiculo(marca, modelo, anoFabricacao, preco));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao recuperar veículos do banco de dados.");
        }
        return veiculos;
    }
    
}
