package Solid_aula2;

public abstract class Cartao_base implements Servico_financeiro {
	public String nome;
	public String numero;
	public String data_validade;
	public double ValorCobrado;
	
	protected boolean ValidarNome() {
		boolean resultado = false;
		//invocar o endpoint da API da operadora de cartao de credito.
		if(this.nome.equalsIgnoreCase("Pedro de Lara")) {
			resultado = true;
			
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	protected boolean ValidarNumero() {
		boolean resultado = false;
		//invocar o endpoint da API da operadora de cartao de credito.
		if(this.numero.equalsIgnoreCase("1234")) {
			resultado = true;
			
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	protected boolean ValidarData() {
		boolean resultado = false;
		//invocar o endpoint da API da operadora de cartao de credito.
		if(this.data_validade.equalsIgnoreCase("08/2030")) {
			resultado = true;
			
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	public boolean validar() {
		if(this.ValidarData()
				&&this.ValidarNumero()
				&&this.ValidarNome()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
