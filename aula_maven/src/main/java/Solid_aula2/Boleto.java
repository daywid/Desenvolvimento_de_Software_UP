package Solid_aula2;

public class Boleto implements Servico_financeiro{
	public String nosso_numero;
	public String data_vencimento;
	public double valor;
	
	public boolean processar() {
		//código para processar o pagamento
		//invocar a API do banco emissor do boleto
		return true;
	}

	@Override
	public boolean Pagar() {
		if(this.processar()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
