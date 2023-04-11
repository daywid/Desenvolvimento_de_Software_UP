package ler_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class arquivo_leitura {

	public static void main(String[] args) {
	cliente cli = new cliente();
	try {
	
	FileReader arq_read = new FileReader("C:\\Users\\Aluno\\Documents\\day\\dados.csv");
	BufferedReader read_this = new BufferedReader(arq_read);
	String leia = read_this.readLine();
	//Dispensar a primeira linha
	leia = read_this.readLine();//ler a segunda linha do arquivo
	cli.cpf = leia.split(";")[0];//cpf
	cli.nome = leia.split(";")[1];//nome
	cli.email = leia.split(";")[2];//email
	
	System.out.println(cli.cpf + "\n" +cli.nome + "\n" +cli.email);
	
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}
