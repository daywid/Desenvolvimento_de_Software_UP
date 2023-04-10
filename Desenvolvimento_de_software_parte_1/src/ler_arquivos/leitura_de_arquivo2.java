package ler_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitura_de_arquivo2 {

	public static void main(String[] args) {
		try {
			FileReader arq_read = new FileReader("C:\\Users\\Aluno\\Documents\\day\\dados.csv");
			BufferedReader read_this = new BufferedReader(arq_read);
			String leia = read_this.readLine();
			while(leia!=null) {
				System.out.println(leia);
				leia = read_this.readLine();
				
			}
			read_this.close();
			arq_read.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
