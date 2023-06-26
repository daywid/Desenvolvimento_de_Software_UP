package atividade_implementação_aluno_e_professor;

public class Consumidor_turma {

	public static void main(String[] args) {

		Aluno a;
		a = new Aluno();
		a.nome = "Maria da Silva";
		a.cpf = "111";
		a.matricula = 123;
		a.email = "maria123@gmail.com";
		
		Turma t = new Turma();
		t.codigo = 1;
//		t.professor = p;
		t.alunos.add(a);
		
		a = new Aluno();
		a.nome = "Antonio Carlos";
		a.cpf = "222";
		a.matricula = 456;
		a.email = "antonio123@gmail.com";
		t.alunos.add(a);
		
		a = new Aluno();
		a.nome = "Ana Almeida";
		a.cpf = "333";
		a.matricula = 789;
		a.email = "ana123@gmail.com";
		t.alunos.add(a);

		System.out.println("Codigo da turma: " +t.codigo);
//		System.out.println("Professor: " + t.professor.nome);
		System.out.println("Alunos e cpf: ");
		 for (String aluno : t.listarAlunos()) {
            System.out.println(aluno);
        }
		
	}

}
