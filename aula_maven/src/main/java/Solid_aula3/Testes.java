package Solid_aula3;

public class Testes {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        
        Graduacao graduacao = new Graduacao();
        System.out.println("Resultado Graduação para " + aluno1.nome + ": " + graduacao.resultado());

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        
        Especializacao especializacao = new Especializacao();
        System.out.println("Resultado Especialização para " + aluno2.nome + ": " + especializacao.resultado());
    }
}
