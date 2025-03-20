package javabank;

public class Conta {
	//Encapsulamento
		//private -> Apenas a propria classe possui acesso
	
	//propriedades	
	private int numero;//global
	private double saldo;
	private String titular;
	
	//Construtor
		//Função especial que será executada na instanciação de uma classe
		//O construtor serve para inicializar uma instancia
	public Conta(int numero, String titular) {
		//Uma variavel local sempre sobrescreve uma global
		//O comando this aponta sempre para a propria classe
		this.numero = numero;
		this.titular = titular;
		saldo = 10;
	}
	
	//comportamentos (interface)
	public void saque(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo = saldo - valor;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposito() {
	}
	public void transferencia() {}
	
	public double retornaSaldo() {
		return saldo;
	}
}

//Linguagem C (ESTRUTURADO), C++ (POO), C# (POO)