package polimorfismo1;

public class Retangulo implements Geometria {
	public double base;
    public double altura;
	
	
	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	
}
