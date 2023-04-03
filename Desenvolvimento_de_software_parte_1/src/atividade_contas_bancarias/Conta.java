package atividade_contas_bancarias;

public class Conta {
	public int numero;
	public String tipo;
	public double saldo;
	
	public Conta(int numero, String tipo, double saldo) {
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		this.saldo+=valor;
		return this.saldo;
	
	}
	public boolean sacar(double valor) {
		
		if(this.saldo<valor) {
		
			return false;
		}
		else  {		
			
			return true;
		}
			
	}
	public double consultar() {
		System.out.println("Saldo da conta: " + numero + ": " + saldo);
		return this.saldo;
	}
	
}
