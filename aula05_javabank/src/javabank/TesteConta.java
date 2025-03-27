package javabank;

public class TesteConta {
	public static void main(String[] args) {
		Cliente cli01 = new Cliente("Juca", "1234", "9123", "Rua ABC");
		
		Conta c1 = new Conta(1001, cli01);		
		Conta c2 = new Conta(1002, new Cliente("Ana", "5678", "4890", "Avenida 123"));
						
		//System.out.println("Titular: " + c1.titular);
		//System.out.println("Numero: " + c1.numero);
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		
		c1.saque(50);
		
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		
		c1.saque(5);
		
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		
		c1.saque(-100);
		
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		
		c1.deposito(3000);
		
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		System.out.println("Saldo[c2]: " + c2.getSaldo());
		
		c1.transferencia(1000, c2);
		
		System.out.println("Saldo[c1]: " + c1.getSaldo());
		System.out.println("Saldo[c2]: " + c2.getSaldo());
		
		//Alterando o nome da Ana para Ana Oliveira
		c2.getTitular().setNome("Ana Oliveira");
		
		System.out.println("Nome alterado: " + c2.getTitular());
		
		System.out.println();
		
	}
}