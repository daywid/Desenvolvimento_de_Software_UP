package Solid_aula2;

public class Venda {
	public double valor_a_cobrar; //atributo provisorio
	
	public boolean ProcessarPagamento(Servico_financeiro f) {
		
		boolean resultado = false;
	
		if(f.Pagar()) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	
}
