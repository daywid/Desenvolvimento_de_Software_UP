package atividade_Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Conta_Corrente contaCorrente = new Conta_Corrente(12345, "Corrente", 1000.0);
        Cliente cliente = new Cliente("123456789", "João", "joao@example.com", contaCorrente);
        Banco banco = new Banco(1, "Meu Banco");

        banco.adicionarCliente(cliente);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Serialização da classe Conta_Corrente
        String jsonContaCorrente = gson.toJson(contaCorrente);
        System.out.println(jsonContaCorrente);

        // Serialização da classe Cliente
        String jsonCliente = gson.toJson(cliente);
        System.out.println(jsonCliente);

        // Serialização da classe Banco
        String jsonBanco = gson.toJson(banco);
        System.out.println(jsonBanco);

        // String JSON para a classe Conta_Corrente
        String jsonContaCorrente2 = "{\"numero\": 12345, \"tipo\": \"Corrente\", \"saldo\": 1000.0}";

        // String JSON para a classe Cliente
        String jsonCliente2 = "{\"cpf\": \"123456789\", \"nome\": \"João\", \"email\": \"joao@example.com\", \"conta\": "
                + jsonContaCorrente + "}";

        // String JSON para a classe Banco
        String jsonBanco2 = "{\"id\": 1, \"nome\": \"Meu Banco\", \"clientes\": [" + jsonCliente + "]}";

        // Mapeamento para a classe Conta_Corrente
        Conta_Corrente contaCorrente2 = gson.fromJson(jsonContaCorrente, Conta_Corrente.class);

        // Mapeamento para a classe Cliente
        Cliente cliente2 = gson.fromJson(jsonCliente, Cliente.class);

        // Mapeamento para a classe Banco
        Banco banco2 = gson.fromJson(jsonBanco, Banco.class);

        // Propriedades da classe Conta_Corrente
        System.out.println("Número: " + contaCorrente.numero);
        System.out.println("Tipo: " + contaCorrente.tipo);
        System.out.println("Saldo: " + contaCorrente.saldo);

        // Propriedades da classe Cliente
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Email: " + cliente.email);
        System.out.println("Conta: ");
        System.out.println("  Número: " + cliente.conta.numero);
        System.out.println("  Tipo: " + cliente.conta.tipo);
        System.out.println("  Saldo: " + cliente.conta.saldo);

        // Propriedades da classe Banco
        System.out.println("ID: " + banco.id);
        System.out.println("Nome: " + banco.nome);
        System.out.println("Clientes: ");
        for (Cliente c : banco.clientes) {
            System.out.println("  Nome do cliente: " + c.nome);
        }

    }
}
