package atividade_conta_bancaria;

public class Consumidor_conta_poupança {
	public static void main(String[] args) {
		ContaPoupanca Conta = new ContaPoupanca();
		Conta.banco = "itau";
		Conta.agencia = "123";
		Conta.depositar(100);

	}

}
