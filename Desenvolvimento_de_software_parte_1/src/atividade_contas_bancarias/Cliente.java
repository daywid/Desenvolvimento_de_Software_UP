package atividade_contas_bancarias;

import java.util.ArrayList;

public class Cliente {
	public String cpf = "";
	public String nome= "";
	public String email = "";
	public ArrayList<Conta> contas;
	
	public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
    }
	
	public boolean adicionarConta(Conta conta) {
		 
		// Verifica se o cliente já possui uma conta do mesmo tipo
		 
		for (Conta c : contas) {
		 
		if (c.tipo.equals(conta.tipo)) {
		return false;
		}
	}
		// Adiciona a nova conta
		contas.add(conta);
		return true; 
		}
		 
		public void mostrarContas() {
		System.out.println("Contas do cliente " + nome + ":");
	
		for (Conta conta : contas) {
		System.out.println("Número: " + conta.numero + ", Tipo: " + conta.tipo + ", Saldo: " + conta.saldo);
		}
		 
		}
}