package atividade_implementação_aluno_e_professor;

import java.util.ArrayList;

public class Turma {
    public int codigo;
	public Professor professor;
    public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public String curso;

    public ArrayList<String> listarAlunos() {
        ArrayList<String> nomesCpfs = new ArrayList<>();

        for (Aluno aluno : alunos) {
            String nomeCpf = aluno.nome + " - " + aluno.cpf;
            nomesCpfs.add(nomeCpf);
        }
        return nomesCpfs;
    }
}