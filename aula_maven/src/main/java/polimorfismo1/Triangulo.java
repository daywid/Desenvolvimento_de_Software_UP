package polimorfismo1;

public class Triangulo implements Geometria{
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	@Override
    public double calcularArea() {
        // Calculando o semi-perímetro
        double s = (ladoA + ladoB + ladoC) / 2;

        // Calculando a área usando a fórmula de Heron
        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        return area;
    }
	
	@Override
	public double calcularPerimetro() {
		return ladoA + ladoB + ladoC;
	}
	
	
	
}
