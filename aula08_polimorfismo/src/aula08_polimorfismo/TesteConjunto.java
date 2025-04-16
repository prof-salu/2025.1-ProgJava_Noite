package aula08_polimorfismo;

import java.util.HashSet;

public class TesteConjunto {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Juca", "juca@gmail.com", "12345678910");
		Pessoa p2 = new Pessoa("Mara", "mara@gmail.com", "98765432109");
		Pessoa p3 = new Pessoa("Juca", "juca@email.com", "99999678910");
		Pessoa p4 = new Pessoa("Angela", "angel@gmail.com", "77889907765");
		Pessoa p5 = new Pessoa("Angela", "angel@gmail.com", "77889907765");
		Pessoa p6 = new Pessoa("Angela", "angel@gmail.com", "77812345467");
		
		HashSet<Pessoa> conjunto = new HashSet<Pessoa>();
		
		conjunto.add(p1);
		conjunto.add(p2);
		conjunto.add(p3);
		conjunto.add(p4);
		conjunto.add(p5);
		conjunto.add(p6);
		
		for (Pessoa pessoa : conjunto) {
			System.out.println(pessoa.hashCode());
		}
	}
}

