package javabank;

public class Gerente extends Funcionario{
	private String senha;
	
	public Gerente(String nome, String cpf, double salario, String senha) {
		//O comando SUPER faz referencia a SUPERCLASSE
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	//SOBRECARGA

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//O bonus do gerente é de 10% do salario + um valor fixo de 1000
	
	//Override --> reescreve/alterar um comportamento
	
	//Para realizar uma reescrita, a subclasse precisa possuir uma função com a mesma assinatura:
	//o mesmo nome, os mesmos parametros e o tipo de retorno igual a função original
	
	@Override //anotação
	public double calculaBonusSalarial() {
		return (getSalario() * 0.1) + 1000;
	}
}