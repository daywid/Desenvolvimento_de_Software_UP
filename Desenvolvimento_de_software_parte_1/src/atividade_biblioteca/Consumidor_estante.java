package atividade_biblioteca;

public class Consumidor_estante {

	public static void main(String[] args) {
		Livro l;
		l = new Livro();
		l.titulo = "Biblia";
		l.autor = "Diversos";
		l.ano_de_publicacao = 0;
		
		Estante e = new Estante();
		e.prateleira = "primeira prateleira";
		e.livros.add(l);
		
		l = new Livro();
		l.titulo = "Alcorão";
		l.autor = "Diversos";
		l.ano_de_publicacao = 0;
		e.livros.add(l);
		
		l = new Livro();
		l.titulo = "Torá";
		l.autor = "Diversos";
		l.ano_de_publicacao = 0;
		e.livros.add(l);
		
		System.out.println(e.listar_titulos());	
	}

}
