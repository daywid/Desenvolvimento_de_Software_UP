/*
Desenvolva o que se pede
1. Implemente uma classe cliente com os atributos {cpf, nome, email e telefone}
1.1 A classe cliente deve possuir um método salvar,
que grava os dados dos atributos em um arquivo clientes.csv, 
que deve possuir um cabeçalho e ser separado por vírgula
1.2 A classe deve possuir um método find_one() que recebe o cpf, 
abre o arquivo clientes.csv, localiza o cpf, 
carrega os dados relativos a esse cpf nos atributos do objeto
1.3 A classe deve possuir un método find_all() 
que abre o arquivo clientes.csv e retorna uma lista de objetos 
com os dados gravados.
1.4 Sempre que um dos métodos de busca (find_one e find_all) não encontrarem, 
deve gerar um exceção (pesquise pelo comando throw ou throws  do java).
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String cpf;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String cpf, String nome, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void salvar() throws IOException {
        FileWriter writer = new FileWriter("clientes.csv", true);
        writer.write("cpf,nome,email,telefone\n");
        writer.write(this.cpf + "," + this.nome + "," + this.email + "," + this.telefone + "\n");
        writer.close();
    }

    public void find_one(String cpf) throws IOException, ClienteNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("clientes.csv"));
        String linha = null;
        boolean found = false;
        while ((linha = reader.readLine()) != null) {
            String[] data = linha.split(",");
            if (data[0].equals(cpf)) {
                this.cpf = data[0];
                this.nome = data[1];
                this.email = data[2];
                this.telefone = data[3];
                found = true;
                break;
            }
        }
        reader.close();
        if (!found) {
            throw new ClienteNotFoundException("Cliente não encontrado");
        }
    }

    public List<Cliente> find_all() throws IOException {
        List<Cliente> clientes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("clientes.csv"));
        String linha = null;
        boolean header = true;
        while ((linha = reader.readLine()) != null) {
            if (header) {
                header = false;
                continue;
            }
            String[] data = linha.split(",");
            Cliente cliente = new Cliente(data[0], data[1], data[2], data[3]);
            clientes.add(cliente);
        }
        reader.close();
        return clientes;
    }
    
    public static void main(String[] args) throws IOException, ClienteNotFoundException {
        Cliente cliente = new Cliente("12345678900", "João", "joao@email.com", "11987654321");
        cliente.salvar();
        Cliente clienteEncontrado = new Cliente("", "", "", "");
        clienteEncontrado.find_one("12345678900");
        System.out.println("Cliente encontrado: " + clienteEncontrado.nome);
        List<Cliente> clientes = cliente.find_all();
        System.out.println("Total de clientes: " + clientes.size());
    }

}

class ClienteNotFoundException extends Exception {
    public ClienteNotFoundException(String message) {
        super(message);
    }
}
