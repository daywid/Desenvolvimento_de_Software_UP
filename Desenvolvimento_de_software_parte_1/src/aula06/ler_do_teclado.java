package aula06;

import java.util.Scanner;

public class ler_do_teclado {

	public static void main(String[] args) {
//		para usar o teclado no console
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		System.out.println("nome: ");
		nome = teclado.next();
		
		System.out.println(nome);
		
	}

}
