package Solid_aula2;

public class Cartao_senf extends Cartao_base{

	@Override
	public boolean validar() {
		if(this.ValidarNumero()
				&&this.ValidarNome()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean Pagar() {
		if(this.validar()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	//ou
	// protected boolean validarData() {
	// 		return true;
	// }


	
}
