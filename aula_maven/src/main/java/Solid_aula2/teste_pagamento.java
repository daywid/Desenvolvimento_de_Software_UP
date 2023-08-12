package Solid_aula2;

public class teste_pagamento {

	public static void main(String[] args) {
		Cartao_credito cc = new Cartao_credito();
		Venda venda = new Venda();
		
		cc.nome = "Pedro de Lara";
		cc.numero = "1234";
		cc.data_validade = "08/2030";
		cc.ValorCobrado = 10100;
		venda.ProcessarPagamento(cc);
		
		if(venda.ProcessarPagamento(cc)) {
			System.out.println("Compra CC confirmada");
		}else {
			System.out.println("Compra CC rejeitada");
		}

		Cartao_senf cs = new Cartao_senf();
		cs.nome = "Pedro de Lara";
		cs.numero = "1234";
		cs.data_validade = "08/2020";
		cs.ValorCobrado = 100;
		
		if(venda.ProcessarPagamento(cs)) {
			System.out.println("Compra CS confirmada");
		}else {
			System.out.println("Compra CS rejeitada");
		}
		
		Boleto b = new Boleto();
		venda.ProcessarPagamento(b);
		
		if(venda.ProcessarPagamento(b)) {
			System.out.println("Compra Boleto confirmada");
		}else {
			System.out.println("Compra boleto rejeitada");
		}
		
		
		
	}

}
