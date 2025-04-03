package javabank;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		//Usuario logado no sistema
		Cliente cli1 = new Cliente("Angela", "123", "456", "Rua ABC");
		Conta c1 = new Conta(1000, cli1);
		Conta c2 = new Conta(1001, cli1);
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao JavaBank\n");
		
		int opcao;
				
		do {
			System.out.println("Escolha uma das opções abaixo: ");		
			System.out.println("1- Consulta de saldo");
			System.out.println("2- Saque");
			System.out.println("3- Deposito");
			System.out.println("4- Transferencia");
			System.out.println("5- Sair");
			//Captura proxima string digitada
			opcao = Integer.parseInt(teclado.nextLine());
			if(opcao == 1) {
				System.out.println("Saldo: R$%.2f".formatted(c1.getSaldo()));
			}else if(opcao == 2) {
				System.out.println("Informe o valor a ser sacado: ");
				double valor = Double.parseDouble(teclado.nextLine());
				c1.saque(valor);				
			}else if(opcao == 3) {
				System.out.println("Informe o valor a ser depositado: ");
				double valor = Double.parseDouble(teclado.nextLine());
				c1.deposito(valor);
			}else if(opcao == 4) {
				System.out.println("Informe o valor a ser transferido: ");
				double valor = Double.parseDouble(teclado.nextLine());
				System.out.println("Informe o numero da conta: ");
				int conta = Integer.parseInt(teclado.nextLine());
				
				if(conta == c2.getNumero()) {
					c1.transferencia(valor, c2);
					System.out.println("Saldo[c1]: R$%.2f".formatted(c1.getSaldo()));
					System.out.println("Saldo[c2]: R$%.2f".formatted(c2.getSaldo()));
				}else {
					System.out.println("Conta não encontrada");
				}
			}else if(opcao < 1 || opcao > 5) {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}while(opcao != 5);
		
		System.out.println("Obrigado por utilizar o JavaBank!");
		//BOA PRATICA, sempre feche o scanner apos a sua utilizacao
		teclado.close();
	}
}