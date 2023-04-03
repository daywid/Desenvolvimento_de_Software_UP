package atividade_conta_bancaria2;

public class ContaPoupança {
	public String banco = "";
	public String agencia = "" ;
	public String conta = "";
	public String tipo = "";
	private double saldo = 0;
	
	public double depositar(double valor) {
		this.saldo += valor;
		return this.saldo;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo<valor) {
			
			return false;
			
		}
		else {
			
		this.saldo -=valor;
		return true;
		}
	}
	public double consulta_saldo() {
		
		return this.saldo;
	}
	
}
