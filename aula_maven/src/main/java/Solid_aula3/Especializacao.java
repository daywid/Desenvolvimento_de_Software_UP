package Solid_aula3;

public class Especializacao implements Curso{

	@Override
	public boolean resultado() {
		char conceito = 0;
		
		if(conceito == 'a' || conceito == 'b' || conceito == 'c') {
			return true;
		}else if(conceito=='d') {
			return false;
		}else {
			return false;
		}
		
	}

}
