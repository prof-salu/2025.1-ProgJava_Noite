package aula09_interfaces_classes_abstratas;

public class TesteProdutos {

	public static void main(String[] args) {
		Software s1 = new Software("Editor de texto", 200, "2.0");
		Hardware h1 = new Hardware("Processador", 1200, "AMD");
		Hardware h2 = new Hardware("Placa-mãe", 700, "Gigabyte");
		
		//Como Produto é uma classe abstrata, ela não pode ser instanciada (ERRO)
		//Produto p1 = new Produto("Camiseta", 100);
		
		System.out.println(s1.getNome() + ": " + s1.calcularPrecoDeVenda());
		System.out.println(h1.getNome() + ": " + h1.calcularPrecoDeVenda());
		//System.out.println(p1.getNome() + ": " + p1.calcularPrecoDeVenda());
		
		h1.conectado(h2);
		s1.atualizar("2.2");
		h2.atualizar("1.6");

	}

}
