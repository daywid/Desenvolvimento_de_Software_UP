package atividade_biblioteca;

import java.util.ArrayList;

public class Estante {

	public String prateleira;
	public ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public ArrayList<String> listar_titulos() {
		ArrayList<String> titulos = new ArrayList<String>();
		
		for(int i=0; i < this.livros.size();i++) {
			titulos.add(this.livros.get(i).titulo);
		}
		return titulos;
	}
	
}
