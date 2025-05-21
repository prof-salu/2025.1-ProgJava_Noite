
import java.util.Scanner;

public class TesteCalculadora {
	
	static Scanner teclado;	

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		String opcao;
		double valor1 = 0, valor2 = 0;
		String mensagem1 = "Informe o valor 1: ";
		String mensagem2 = "Informe o valor 2: ";
		do {
			imprimeMenu();
			opcao = teclado.nextLine();
			
			switch(opcao) {
				case "1":
					System.out.println("***Operação de SOMA***");
					
					
					System.out.println(mensagem1);
					valor1 = capturaNumeroReal(teclado.nextLine(), mensagem1);
					
					System.out.println(mensagem2);
					valor2 = capturaNumeroReal(teclado.nextLine(),  mensagem2);
					
					System.out.println("Soma: " + calculadora.somar(valor1, valor2));
					break;
				case "2":
					System.out.println("***Operação de MULTIPLICAÇÃO***");
					
					System.out.println(mensagem1);
					valor1 = capturaNumeroReal(teclado.nextLine(), mensagem1);
					
					System.out.println(mensagem2);
					valor2 = capturaNumeroReal(teclado.nextLine(),  mensagem2);
					
					System.out.println("Multiplicação: " + calculadora.multiplicar(valor1, valor2));
					break;
				case "3":
					System.out.println("***Operação de DIVISÃO***");
					System.out.println(mensagem1);
					valor1 = capturaNumeroReal(teclado.nextLine(), mensagem1);
					
					System.out.println(mensagem2);
					valor2 = capturaNumeroReal(teclado.nextLine(),  mensagem2);
					
					try {
						if(valor2 == 0) {
							//Força o lançamento de uma exceção
							throw new IllegalArgumentException("O divisor da operação não pode ser ZERO.");
						}
						System.out.println("Divisão: " + calculadora.dividir(valor1, valor2));
					}catch(IllegalArgumentException e) {
						System.out.println(e);
						System.out.println("Ocorreu um erro na divisão.");
					}
					
					break;
				case "4":
					System.out.println("***Operação de SUBTRAÇÃO***");
					System.out.println(mensagem1);
					valor1 = capturaNumeroReal(teclado.nextLine(), mensagem1);
					
					System.out.println(mensagem2);
					valor2 = capturaNumeroReal(teclado.nextLine(),  mensagem2);
					
					System.out.println("Multiplicação: " + calculadora.subtrair(valor1, valor2));
					break;
				case "5":
					System.out.println("***SAINDO DO PROGRAMA***");
					break;
				default :
					System.out.println("Opção inválida");
					break;
			}
			
		}while(!opcao.equals("5"));
		
		teclado.close();
		System.out.println("Programa encerrado...");
	}
	
	public static void imprimeMenu() {
		System.out.println("Informe a operação: ");
		System.out.println("1- Somar");
		System.out.println("2- Multiplicar");
		System.out.println("3- Dividir");
		System.out.println("4- Subtrair");
		System.out.println("5- Sair");
	}
	
	public static double capturaNumeroReal(String valor, String mensagem) {
		double numero = 0;
		
		try {
			numero = Double.valueOf(valor);
		}catch(NumberFormatException e){
			System.out.println("O valor informado deve ser numerico. Tente novamente.");
			System.out.println(mensagem);
			
			numero = capturaNumeroReal(teclado.nextLine(), mensagem);
		}
		
		return numero;
	}

}

