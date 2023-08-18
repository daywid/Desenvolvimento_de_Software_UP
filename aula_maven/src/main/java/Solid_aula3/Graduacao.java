package Solid_aula3;

public class Graduacao implements Curso{

	@Override
	public boolean resultado() {
		double media = 0;
		
		if(media>=6) {
			return true;
		}else {
			return false;
		}
		
	}
}
