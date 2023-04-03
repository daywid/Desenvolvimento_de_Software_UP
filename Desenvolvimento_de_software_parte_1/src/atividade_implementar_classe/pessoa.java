package atividade_implementar_classe;

public class pessoa {

	public String cpf;	
	public String nome;
	public String sobrenome;
	private double salario;
	
	public String mostrar_nome_completo() {
		return this.nome + this.sobrenome;
	}

	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
