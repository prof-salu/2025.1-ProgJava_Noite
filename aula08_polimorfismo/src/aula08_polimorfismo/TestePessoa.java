package aula08_polimorfismo;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Juca", "juca@gmail.com", "12345678910");
		Pessoa p2 = new Pessoa("Mara", "mara@gmail.com", "98765432109");
		Pessoa p3 = new Pessoa("Juca", "juca@gmail.com", "99999678910");
		Pessoa p4 = p1;//P4 aponta para a mesma posicao de memoria de p1
		
		//Exibe uma instancia em formato de texto.
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		//Compara duas instancia e verifica se são iguais.
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		
		//Gerar um valor inteiro baseado nos dados da classe.
		System.out.println(p1.hashCode());

	}

}
