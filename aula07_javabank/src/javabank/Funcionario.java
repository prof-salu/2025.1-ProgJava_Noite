package javabank;

public class Funcionario {
	//O modificador PUBLIC permite acesso para todas as classes
	//O modificador PRIVATE permite acesso apenas pela propria classe
	private String nome;
	private String cpf;
	//O modificador PROTECTED permite acesso apenas para classes filhas e do mesmo pacote
	//O modificador DEFAULT permite acesso apenas para classes do mesmo pacote	
	private double salario;
	
	//SOBRECARGA DE CONSTRUTORES
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
		
	public Funcionario() {
		
	}
	
	//No final do ano ganho uma bonificacao de 10% do salario
	public double calculaBonusSalarial() {
		return salario * 0.1;//10%
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
