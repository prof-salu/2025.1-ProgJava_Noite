package aula09_interfaces_classes_abstratas;

//Classes abstratas não podem ser instanciadas.

//Uma classe abstrata pode conter métodos/funções abstratas

//FINAL
	//em variaveis --> CONSTANTE --> Constantes devem ser declaradas em CAIXA_ALTA
	//em classes --> Uma classe final não pode ter filhos
	//em funções --> Uma função final não pode ser reescrita
public abstract class Produto {
	private final String NOME;
	private double precoDeFabrica;
	
	public Produto(String nome, double precoDeFabrica) {
		this.NOME = nome;
		this.precoDeFabrica = precoDeFabrica;
	}

	public String getNome() {
		return NOME;
	}
	
	public double getPrecoDeFabrica() {
		return precoDeFabrica;
	}
	
	//Uma função/método abstrato não possui implementação, possue apenas assinatura
	//Assinatura de uma função --> nome, retorno e os seus parametros
	//Uma função abstrata deve ser obrigatoriamente reescrita nas classes filhas concretas
	public abstract double calcularPrecoDeVenda();
}