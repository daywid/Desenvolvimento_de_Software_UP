package medias_de_alunos;

public class MediaAluno {
    
   // public double nota1 = 0, nota2 = 0, nota3 = 0,media;
   // public int mediaTipo1,mediatipo2,mediatipo3;
   public double media;

    public double mediaTipo1 (double nota1, double nota2, double nota3 ){
        media = (nota1+nota2+nota3)/3;
        System.out.println("A média do aluno é: " +media);
        if (media <6) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
        return media;
    }
    
    public double mediatipo2 (double nota1, double nota2, double nota3 ) {
        media = (nota1*5 + nota2*3 + nota3*2)/(5+3+2);
        System.out.println("A média do aluno é: " +media);
        if (media <6) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
        return media;
    }

    public double mediatipo3 (double nota1, double nota2, double nota3 ) {
        media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
        System.out.println("A média do aluno é: " +media);
        if (media <6) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
        return media;
    }
}


