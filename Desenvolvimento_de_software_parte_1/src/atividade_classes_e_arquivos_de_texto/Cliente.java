package atividade_classes_e_arquivos_de_texto;
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
deve gerar um exceção.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public String cpf = "";
	public String nome = "";
	public String email = "";
	public String telefone = "" ;
	
	public void Salvar() {
		String separador = ",";
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\Aluno\\Documents\\day\\clientes.csv",true);
			String linha = this.cpf+ separador +
					this.nome+ separador + 
					this.email;
			arquivo.write(linha + "\n");
			arquivo.flush();
			arquivo.close();	
		
		} catch (IOException e) {
			e.printStackTrace();}
		}
		
	public void find_one(String cpf) throws IOException {
		FileReader arquivo = new FileReader("clientes.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		
		String linha = leitor.readLine();
		while (linha != null) {
			String[] dados = linha.split(",");
			if (dados[0].equals(cpf)) {
				this.cpf = dados[0];
				this.nome = dados[1];
				this.email = dados[2];
				this.telefone = dados[3];
				leitor.close();
				arquivo.close();
				return;
			}
		linha = leitor.readLine();
	}
	leitor.close();
	arquivo.close();
	throw new IllegalArgumentException("Cliente não encontrado");
	
	}
	
	public List<Cliente> find_all() throws IOException{
		FileReader arquivo = new FileReader("Cliente.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		String linha = leitor.readLine();
		while (linha != null) {
			String[] dados = linha.split(",");
			Cliente cliente = new Cliente();
			cliente.cpf = dados[0];
			cliente.nome = dados[1];
			cliente.email = dados[2];
			cliente.telefone = dados[3];
			clientes.add(cliente);
			linha = leitor.readLine();
		}
		leitor.close();
		arquivo.close();
		return clientes;
	}
	
	
	
}
