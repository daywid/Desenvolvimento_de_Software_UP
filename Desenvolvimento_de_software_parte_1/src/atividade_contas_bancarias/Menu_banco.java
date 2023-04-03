package atividade_contas_bancarias;

import java.util.Scanner;

public class Menu_banco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco("Banco do João");
		
		while(true) {
			System.out.println("========= Menu do Banco =========");
			System.out.println("1 - Adicionar Cliente");
			System.out.println("2 - Adicionar Conta");
			System.out.println("3 - Depositar");
			System.out.println("4 - Sacar");
			System.out.println("5 - Consultar Saldo");
			System.out.println("6 - Mostrar Contas do Cliente");
			System.out.println("7 - Total de Depósitos no Banco");
			System.out.println("0 - Sair");
			
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o CPF do cliente: ");
				String cpf = scanner.next();
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.next();
				System.out.print("Digite o email do cliente: ");
				String email = scanner.next();
				Cliente cliente = new Cliente(cpf, nome, email);
				banco.adicionarCliente(cliente);
				System.out.println("Cliente adicionado com sucesso!");
				break;
				
			case 2:
				System.out.print("Digite o CPF do cliente: ");
				cpf = scanner.next();
				cliente = null;
				for (Cliente c : banco.clientes) {
					if (c.cpf.equals(cpf)) {
						cliente = c;
					}
				}
				if (cliente == null) {
					System.out.println("Cliente não encontrado!");
					break;
				}
				System.out.print("Digite o número da conta: ");
				int numero = scanner.nextInt();
				System.out.print("Digite o tipo da conta: ");
				String tipo = scanner.next();
				System.out.print("Digite o saldo inicial: ");
				double saldo = scanner.nextDouble();
				Conta conta = new Conta(numero, tipo, saldo);
				if (cliente.adicionarConta(conta)) {
					System.out.println("Conta adicionada com sucesso!");
				} else {
					System.out.println("O cliente já possui uma conta desse tipo!");
				}
				break;
				
			case 3:
				System.out.print("Digite o número da conta: ");
				numero = scanner.nextInt();
				conta = null;
				for (Cliente c : banco.clientes) {
					for (Conta co : c.contas) {
						if (co.numero == numero) {
							conta = co;
							break;
						}
					}
					if (conta != null) {
						break;
					}
				}
				if (conta == null) {
					System.out.println("Conta não encontrada!");
					break;
				}
				System.out.print("Digite o valor a ser depositado: ");
				double valor = scanner.nextDouble();
				conta.depositar(valor);
				System.out.println("Depósito realizado com sucesso!");
				break;
				
			case 4:
                System.out.print("Digite o número da conta: ");
                numero = scanner.nextInt();

                conta = null;
                for (Cliente c : banco.clientes) {
                    for (Conta co : c.contas) {
                        if (co.numero == numero) {
                            conta = co;
                            break;
                        }
                    }
                    if (conta != null) {
                        break;
                    }
                }

                if (conta ==null){
                    System.out.println("Conta não encontrada!");
                    break;
                }

                System.out.print("Digite o valor a ser sacado: ");
                valor = scanner.nextDouble();

                if (conta.sacar(valor)) {
                    System.out.println("Saque realizado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;

            case 5:
                System.out.print("Digite o número da conta: ");
                numero = scanner.nextInt();

                conta = null;
                for (Cliente c : banco.clientes) {
                    for (Conta co : c.contas) {
                        if (co.numero == numero) {
                            conta = co;
                            break;
                        }
                    }
                    if (conta != null) {
                        break;
                    }
                }

                if (conta == null) {
                    System.out.println("Conta não encontrada!");
                    break;
                }

                System.out.println(" R$" + conta.consultar());
                break;

            case 6:
                System.out.print("Digite o CPF do cliente: ");
                cpf = scanner.next();

                cliente = null;
                for (Cliente c : banco.clientes) {
                    if (c.cpf.equals(cpf)) {
                        cliente = c;
                        break;
                    }
                }

                if (cliente == null) {
                    System.out.println("Cliente não encontrado!");
                    break;
                }

                System.out.println("Contas do cliente " + cliente.nome + ":");
                for (Conta co : cliente.contas) {
                    System.out.println("- Conta " + co.numero + " (" + co.tipo + ")");
                }
                break;

            case 7:
                System.out.println("Total de depósitos do banco: R$" + banco.totalDepositos());
                break;

            case 0:
                System.out.println("Obrigado por utilizar nosso banco!");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

    } 
}
			   
			
}
		
			