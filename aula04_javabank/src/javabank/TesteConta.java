package javabank;

public class TesteConta {
	public static void main(String[] args) {
		Conta c1 = new Conta(1001, "Juca");
		
		Conta c2 = new Conta(1002, "Ana");
		
		
		//System.out.println("Titular: " + c1.titular);
		//System.out.println("Numero: " + c1.numero);
		System.out.println("Saldo[c1]: " + c1.retornaSaldo());
		
		c1.saque(50);
		
		System.out.println("Saldo[c1]: " + c1.retornaSaldo());
		
		c1.saque(5);
		
		System.out.println("Saldo[c1]: " + c1.retornaSaldo());
		
		c1.saque(-100);
		
		System.out.println("Saldo[c1]: " + c1.retornaSaldo());
		
		//Erro, atributos privados
		//c1.saldo = c1.saldo - 1000000;
		
		System.out.println("Saldo[c1]: " + c1.retornaSaldo());
	}
}