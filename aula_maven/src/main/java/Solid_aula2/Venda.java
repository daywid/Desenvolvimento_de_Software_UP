package Solid_aula2;

public class Venda {
	public double valor_a_cobrar; //atributo provisorio
	
	public boolean ProcessarPagamento(CartaoDeCredito cartao) {
		
		boolean resultado = false;
	
		if(cartao.validar()) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	
}
