package aula01;

public class consumidor_calculadora {

	public static void main(String[] args) {
		calculadora calc = new calculadora(); //instancia e constroi um objeto do tipo
		calculadora c = new calculadora(); //instancia e constroi um objeto
		
		calc.fator_1 = 11;
		calc.fator_2 = 10;
		
		System.out.println(calc.somar(calc.fator_1,calc.fator_2));
		System.out.println(calc.soma_zera(calc.fator_1, calc.fator_2));
		System.out.println(c);
	}

}
