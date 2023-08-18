package polimorfismo1;


//1. Crie uma classe "geometria" que processe diferentes formas usando polimorfismo. Você implementara classes  Circulo e Retangulo, 
//ambas devem calcular e exibir a respectiva area de diferentes e o repectivo perimetro.
//O resultado da area e do perimetro devem ser impressos na tela pelo programa consumidor a partir da classe "geometria".
//
//Importante:
//- respeite a responsabilidade única 
//- respeite o principio Aberto para Extensão e Fechado para Mudança


public interface Geometria {

	double calcularArea();
	double calcularPerimetro();
	
}

