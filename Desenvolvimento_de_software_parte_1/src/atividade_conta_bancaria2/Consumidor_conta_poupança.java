package atividade_conta_bancaria2;

public class Consumidor_conta_poupança {
	public static void main(String[] args) {
		ContaPoupança conta = new ContaPoupança();
		conta.banco = "itau";
		conta.agencia = "123";
		conta.depositar(100);
		System.out.println(conta.consulta_saldo());
		
		conta.sacar(50);
		System.out.println(conta.consulta_saldo());
		
		if(conta.sacar(100)) {
		System.out.println("saque realizado. Saldo atual: "+ conta.consulta_saldo());
		
		
	}
		else {
			
			System.out.println("Erro no saque. Saldo atual: "+ conta.consulta_saldo());
		}
		

	}
}
