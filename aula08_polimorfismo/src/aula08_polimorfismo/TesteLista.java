package aula08_polimorfismo;

import java.util.ArrayList;

public class TesteLista {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Juca", "juca@gmail.com", "12345678910");
		Pessoa p2 = new Pessoa("Mara", "mara@gmail.com", "98765432109");
		Pessoa p3 = new Pessoa("Juca", "juca@email.com", "99999678910");
		Pessoa p4 = new Pessoa("Angela", "angel@gmail.com", "77889907765");
		
		//Coleções
		//ArrayList e uma das implementações de listas em JAVA
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		//FOR(FOREACH) estrutura de repetição utilizada em coleções
		for(Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		
		lista.remove(p1);
		lista.remove(p4);
		System.out.println();
		
		for(Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		
		System.out.println();
		//Retorna um elemento da lista baseado em sua posição atual
		System.out.println(lista.get(1));
		
		System.out.println();
		
		//Verifica se um elemento está armazenado na lista
		System.out.println(lista.contains(p4));
	}

}
