package polimorfismo1;

public class Consumidor {

    public static void main(String[] args) {
        // Criando objetos das diferentes formas geométricas
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Retangulo retangulo = new Retangulo();
        retangulo.base = 4;
        retangulo.altura = 6;

        Triangulo triangulo = new Triangulo();
        triangulo.ladoA = 3;
        triangulo.ladoB = 4;
        triangulo.ladoC = 5;

        // Calculando e exibindo as áreas e perímetros
        exibirAreaEPerimetro(circulo);
        exibirAreaEPerimetro(retangulo);
        exibirAreaEPerimetro(triangulo);
    }

    // Método genérico para exibir área e perímetro de formas geométricas
    public static void exibirAreaEPerimetro(Geometria forma) {
        System.out.println("Área: " + forma.calcularArea());
        System.out.println("Perímetro: " + forma.calcularPerimetro());
        System.out.println();
    }
}
