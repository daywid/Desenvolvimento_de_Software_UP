package ler_arquivos;

import java.util.Scanner;

public class consumidor_grava_cliente {

	public static void main(String[] args) {
		String op = "";
		Scanner teclado = new Scanner(System.in);
		cliente cli = new cliente();
		while(! op.equals("0")) {
			System.out.println("Digite as informações do cliente.");
			System.out.println("cpf: \n");
			cli.cpf = teclado.nextLine();
			teclado = new Scanner(System.in);
			
			
			System.out.println("Nome: \n");
			cli.nome = teclado.nextLine();
			teclado = new Scanner(System.in);
			
			System.out.println("Email: \n");
			cli.email = teclado.nextLine();
			teclado = new Scanner(System.in);
			
			cli.salvar();
			System.out.println("Salvo com sucesso! \n");
			System.out.println("Deseja continuar? (0 para sair)");
			op = teclado.nextLine();
		}
		

	}

}
