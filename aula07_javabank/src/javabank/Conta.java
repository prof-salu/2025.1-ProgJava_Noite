package javabank;

public class Conta {
	//Encapsulamento
		//private -> Apenas a propria classe possui acesso
	
	//propriedades (instancia)
	private int numero;//global
	private double saldo;
	private Cliente titular;//Composição
	//propriedade (classe)
	private static int totalContas = 0;
	
	//Construtor
		//Função especial que será executada na instanciação de uma classe
		//O construtor serve para inicializar uma instancia
	public Conta(int numero, Cliente titular) {
		//Uma variavel local sempre sobrescreve uma global
		//O comando this aponta sempre para a propria classe
		this.numero = numero;
		this.titular = titular;
		saldo = 10;
		totalContas = totalContas + 1;
	}
	
	//Setters[editar] & Getters [capturar]
	
	//Para acessar uma propriedade estática, sempre utilize métodos estáticos
	public static int getTotalContas() {
		return totalContas;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;		
	}
	
	
	//comportamentos (interface)
	public boolean saque(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo = saldo - valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public boolean deposito(double valor) {
		if (valor > 0) {
			//saldo = saldo + valor; //Equivale a expressão abaixo
			//+=, -=, *=, /=, %=
			saldo += valor;
			return true;
		}else {
			System.out.println("Operação inválida!");
			return false;
		}		
	}
	public boolean transferencia(double valor, Conta favorecido) {
		if(saque(valor) == true) {
			favorecido.deposito(valor);
			return true;
		}else {
			System.out.println("Operação falhou!");
			return false;
		}
	}
	
	
}

//Linguagem C (ESTRUTURADO), C++ (POO), C# (POO)