package Aula03;

public class Consumidor_mao {

	public static void main(String[] args) {
		dedo d;//instanciando o d
		d = new dedo();	// construindo  o objeto d; nessa hora ocorre a criacao do objeto	
		d.posicao = 1;
		
		mao m = new mao();
		m.lado = "Direito";
		m.dedos.add(d);//adiciona o d na lista dedos da m
//		System.out.println(m.dedos.size());

		
		d = new dedo();//construindo outro objeto d, portanto com um novo object id
		d.posicao=2;
		m.dedos.add(d);
//		System.out.println(m.dedos.size());
	
		d = new dedo();//construindo outro objeto d, portanto com um novo object id
		d.posicao=3;
		m.dedos.add(d);
		for(int i=0; i < m.dedos.size();i++) {
			System.out.println(m.dedos.get(i).posicao);
		}
	
		
	}

}
