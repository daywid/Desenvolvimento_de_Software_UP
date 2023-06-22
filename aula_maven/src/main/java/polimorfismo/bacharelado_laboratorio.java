package polimorfismo;

public class bacharelado_laboratorio extends curso{

	public double custo_lab;

	public double GetCusto_do_Curso() {
		 return valor_parcela + custo_lab;
	}

	public String gGetNome_do_Curso() {
		return nome_curso;
	}

}
