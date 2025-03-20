package aula03;

public class TesteCliente {
	//CTRL + ESPAÇO --> AUTO COMPLETAR
	public static void main(String[] args) {
		//Instanciação
		Cliente c1 = new Cliente();		
		//Preenchendo os dados de uma cliente
		//DOT NOTATION
		c1.nome = "Bruno Henrique";
		c1.dataDeNascimento = "23/11/1992";
		c1.cpf = "12354678910";
		c1.sexo = "Masculino";
		c1.telefone = "987654321";
		
		Cliente c2 = new Cliente();		
		c2.nome = "Mariana Rodrigues";
		c2.dataDeNascimento = "01/01/2000";
		c2.cpf = "908798798";
		c2.telefone = "9875676878";
		c2.sexo = "Feminino";
		
		Cliente c3 = new Cliente();
		c3.nome = "Mariana Rodrigues";
		c3.dataDeNascimento = "01/01/2000";
		c3.cpf = "908798798";
		c3.telefone = "9875676878";
		c3.sexo = "Feminino";
		
		//syso + CTRL + ESPAÇO --> System.out.println(); 
		c2.exibeDados();
		
		System.out.println();
		
		c1.exibeDados();
		
		System.out.println();
		
		//Pq retornou falso, se os dados são os mesmos?
		System.out.println(c2 == c3);
		
		System.out.println(c2.cpf == c3.cpf);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);		
		
		Cliente c4 = c2;
		System.out.println(c4 == c2);
		System.out.println(c4);

	}
}
