package aula01;

public class calculadora {
	public double fator_1;
	public double fator_2;
	private double s;
	public String texto1;
	public String texto2;
	
	public double somar(double valor1, double valor2) {
		s = valor1 + valor2;
		return (s);
		
	}
	
	public double soma_zera(double valor1,double valor2) {
		zerar_n1();
		return (valor1+valor2);
		
	}
	
	private void zerar_n1() {
		//metodo exemplo que altera o valor de n1 para zero
		this.fator_1 = 0;//alterar o valor da propriedade fator_1	
	}
	
	public String concatena_texto() {
		return this.texto1 + this.texto2;
		
	}
	
}
