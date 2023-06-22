package polimorfismo;

import java.util.ArrayList;
import java.util.function.IntConsumer;

public class consumidor_inter_cursos {

	public static void main(String[] args) {
		ArrayList<intercurso> cursos = new ArrayList<intercurso>();
		//Instanciar um bacharelado
		bacharelado BSI = new bacharelado();
		BSI.nome_curso="BSI";
		BSI.carga_horaria = 3600;
		BSI.valor_parcela = 1200;
		
		//Instanciar um bacharelado com laboratorio
		bacharelado_laboratorio ODONTO = new bacharelado_laboratorio();
		ODONTO.nome_curso = "Odonto";
		ODONTO.carga_horaria = 4000;
		ODONTO.valor_parcela = 5000;
		ODONTO.custo_lab = 1000;
		
		bacharelado_laboratorio VETERINARIA = new bacharelado_laboratorio();
		VETERINARIA.nome_curso="Vet";
		VETERINARIA.carga_horaria = 3800;
		VETERINARIA.valor_parcela = 2500;
		VETERINARIA.custo_lab = 800;
		
		// Criar estudante
        estudante aluno = new estudante();
        aluno.nome = "João";
        aluno.cpf = "123456789";
        aluno.email = "joao@example.com";

        // Adicionar cursos ao estudante
        aluno.adicionarCurso(BSI);
        aluno.adicionarCurso(ODONTO);
        aluno.adicionarCurso(VETERINARIA);

        // Listar o nome dos cursos adicionados
        for (intercurso curso : aluno.cursos) {
            System.out.println(curso.gGetNome_do_Curso());
        }


		aluno.listarValorParcelas();
	}

}
