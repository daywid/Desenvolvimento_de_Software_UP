package atividade_implementação_aluno_e_professor;

public class ver_classe_do_objeto {

	public static void main(String[] args) {
		Turma t = new Turma();
		System.out.println(t.alunos.size());
		try {
		System.out.println(t.alunos.get(0).getClass());
	}
	catch (Exception e){
		System.out.println("Algo de errado não está certo"  + e.getMessage());
		e.printStackTrace();
	}
	}
}
