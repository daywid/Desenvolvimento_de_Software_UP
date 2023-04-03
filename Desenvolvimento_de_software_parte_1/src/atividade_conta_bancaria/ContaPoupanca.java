package atividade_conta_bancaria;

public class ContaPoupanca {
	public String banco = "";
	public String agencia = "" ;
	public String conta = "";
	public String tipo = "";
	private double saldo = 0;
	
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
	
	public double consultar(double saldo) {
		
		return this.saldo;
	}
	
}
