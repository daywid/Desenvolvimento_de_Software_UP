package atividade_implementação_aluno_e_professor;

public class Professor {

	public String cpf = "";
	public int matricula;
	public String nome = "";
	public String email = "";

	//construtor padrão:
	Professor(){}
	
	
	//construtor com argumentos
	public Professor(String cpf, int matricula, String nome, String email) {
		this.cpf = cpf;
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}
}
