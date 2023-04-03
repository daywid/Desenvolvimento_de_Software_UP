package atividade_contas_bancarias;

import java.util.ArrayList;

public class Banco {
	public String nome;
	public ArrayList<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		return clientes.add(cliente);
		
	}
	
	public double totalDepositos() {
		double total = 0;
		for (Cliente cliente : clientes) {
			for (Conta conta : cliente.contas) {
				total += conta.saldo;
			}	
		}
		return total;
	}
}