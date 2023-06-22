/*  Com bases nas classes implementadas em sala, implemente uma classe estudante que possua uma lista de cursos.
Essa lista deve permitir diferentes tipos de cursos (com uso imprescindível de polimorfismo)

A classe estudante deve possuir um método que lista o valor total das parcelas do estudante de acordo com os cursos adicionados na lista de cursos do próprio estudante.

Por exemplo

estudante aluno = new estudante();

aluno.cursos.add(BSI);

aluno.cursos.add(ODONTO);

sysout(aluno.getValorTotal()); //Imprimir a soma das parcelas de cada curso adicionado em aluno.cursos 
*/

package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class estudante {

    public String nome;
    public String cpf;
    public String email;
    public List<intercurso> cursos;


     public estudante() {
        cursos = new ArrayList<>();
    }

    public void adicionarCurso(intercurso curso) {
        cursos.add(curso);
    }

    public void listarValorParcelas() {
        double totalParcelas = 0;
        for (intercurso curso : cursos) {
            totalParcelas += curso.GetCusto_do_Curso();
        }
        System.out.println("Valor total das parcelas: " + totalParcelas);
    }
}
