package polimorfismo1;

public class Circulo implements Geometria {
	public double raio;
	@Override
	public double calcularArea() {
		 return Math.PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	
}
