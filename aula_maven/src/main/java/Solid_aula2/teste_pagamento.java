package Solid_aula2;

public class teste_pagamento {

	public static void main(String[] args) {
		CartaoDeCredito cc = new CartaoDeCredito();
		Venda venda = new Venda();
		
		cc.nome = "Pedro de Lara";
		cc.numero = "1234";
		cc.data_validade = "08/2030";
		cc.ValorCobrado = 10100;
		venda.ProcessarPagamento(cc);
		
		if(venda.ProcessarPagamento(cc)) {
			System.out.println("Compra confirmada");
		}else {
			System.out.println("Compra rejeitada");
		}

	}

}
