package Solid_aula2;

public class Cartao_credito extends Cartao_base {

	@Override
	public boolean Pagar() {
		if(this.validar()) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
