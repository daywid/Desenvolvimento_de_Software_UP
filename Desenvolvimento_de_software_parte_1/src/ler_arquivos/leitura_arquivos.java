package ler_arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class leitura_arquivos {

	public static void main(String[] args)   {
		String arquivo = "C:\\Users\\Aluno\\Documents\\day\\dados.csv";
	try {
		FileInputStream stream = new FileInputStream(arquivo);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader buf_reader = new BufferedReader(reader);
		String linha = "";
		
		while (linha !=null) {
			System.out.println(linha);
			linha = buf_reader.readLine();
		}
		buf_reader.close();
		reader.close();
		stream.close();
		}
		
	catch (IOException e) {
			e.printStackTrace();
		}
	}
	}