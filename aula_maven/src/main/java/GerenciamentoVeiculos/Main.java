package GerenciamentoVeiculos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // UTILIZANDO BANCO DE DADOS:
        Armazenamento bancoDeDados = new BancoDeDadosArmazenamento(); 
        Concessionaria concessionaria = new Concessionaria(bancoDeDados);

        // UTILIZANDO ARQUIVO:
        //Armazenamento arqArmazenamento = new ArquivoArmazenamento("c://Users//daywid//Downloads//veiculos.txt");
        //Concessionaria concessionaria = new Concessionaria(arqArmazenamento);    
    
        Veiculo carro1 = new Carro("Ford", "Focus", 2022, 25000.0, 4);
        Veiculo moto1 = new Motocicleta("Honda", "CBR500R", 2021, 8000.0, 500);

        concessionaria.adicionarVeiculo(carro1);
        concessionaria.adicionarVeiculo(moto1);

        List<Veiculo> veiculos = concessionaria.listarVeiculos();
        for (Veiculo veiculo : veiculos) {
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo());
        }
    }
}
