import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//Extra: interface de Cadastro e busca de clientes.

public class Consumidor_Clientes {

    public static void main(String[] args) throws IOException, ClienteNotFoundException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de clientes! ");
        System.out.println("Pressione 1 para cadastrar novos clientes.");
        System.out.println("Pressione 2 para buscar um cliente pelo CPF.");
        System.out.println("Pressione 3 para ver todos os clientes cadastrados.");
        String opcao = leitor.nextLine();

        if (opcao.equals("1")) {
            String op2 = "";
            while (!op2.equals("0")) {
                System.out.println("Digite o CPF do cliente: ");
                String cpf = leitor.nextLine();
                System.out.println("Digite o nome do cliente: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o email do cliente: ");
                String email = leitor.nextLine();
                System.out.println("Digite o telefone do cliente: ");
                String telefone = leitor.nextLine();

                Cliente cliente = new Cliente(cpf, nome, email, telefone);
                cliente.salvar();

                System.out.println("Dados do cliente salvos com sucesso!");

                System.out.println("Deseja continuar? (0 para sair)");
                op2 = leitor.nextLine();
            }
        } else if (opcao.equals("2")) {
            System.out.println("Digite o CPF do cliente a ser buscado: ");
            String cpf = leitor.nextLine();

            Cliente clienteEncontrado = new Cliente("", "", "", "");
            try {
                clienteEncontrado.find_one(cpf);
                System.out.println("Cliente encontrado: " + clienteEncontrado.nome);
            } catch (ClienteNotFoundException e) {
                System.out.println("Cliente não encontrado.");
            }
        } else if (opcao.equals("3")) {
            List<Cliente> clientes = new Cliente("", "", "", "").find_all();
            System.out.println("Total de clientes: " + clientes.size());
            for (Cliente cliente : clientes) {
                System.out.println("CPF: " + cliente.cpf + ", Nome: " + cliente.nome +
                                   ", Email: " + cliente.email + ", Telefone: " + cliente.telefone);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}