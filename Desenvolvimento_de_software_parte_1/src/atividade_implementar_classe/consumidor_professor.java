package atividade_implementar_classe;

public class consumidor_professor {

	public static void main(String[] args) {
		pessoa Professor = new pessoa();
		Professor.nome = "Pedro"; 
		Professor.sobrenome = " de Lara";
		Professor.cpf = "888";

		//System.out.println(Professor.nome);
		//System.out.println(Professor.sobrenome);
		System.out.println(Professor.mostrar_nome_completo());
		System.out.println(Professor.cpf);
		System.out.println();
	}

}
