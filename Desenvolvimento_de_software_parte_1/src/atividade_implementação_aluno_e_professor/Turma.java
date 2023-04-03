package atividade_implementação_aluno_e_professor;

import java.util.ArrayList;

public class Turma {

	public int codigo;
//	public Professor professor = new Professor(); 
	public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public String curso;
	public ArrayList<String> listar_alunos() {
		ArrayList<String> nomes = new ArrayList<String>();
		//		String alunos = "";
		
		for(int i=0; i < this.alunos.size();i++) {
			nomes.add(this.alunos.get(i).nome);
		}
		return nomes;
	}
	public ArrayList<String> getAlunos(int pos){
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add(this.alunos.get(pos).nome);
		return nomes;
	}
	
}
