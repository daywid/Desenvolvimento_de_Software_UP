package medias_de_alunos;

import java.util.Scanner;

public class ConsumidorMedias {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            MediaAluno med = new MediaAluno();

            System.out.println("Digite a nota 1: ");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a nota 2: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Digite a nota 3: ");
            double nota3 = leitor.nextDouble();

      System.out.println("Insira o tipo de media a ser calculada:\n 1 - Aritmetica.\n 2 - Ponderada.\n 3 - Harmonica \n");
            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    med.mediaTipo1(nota1, nota2, nota3);
                    break;
                case 2:
                    med.mediatipo2(nota1, nota2, nota3);
                    break;
                case 3:
                    med.mediatipo3(nota1, nota2, nota3);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}
