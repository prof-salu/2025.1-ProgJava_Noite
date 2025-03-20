package aula03;

public class Cliente {
	//Propriedades
		//Variaveis em java:
			//sempre começar com letras minusculas
			//Nao pode começar com numeros
			//Nao pode possuir espaços em branco
			//Nao pode usar caracteres especiais, com excecao ao underline
			//Nao pode ser uma palavra reservada
	String nome;
	String sexo;
	String cpf;
	String dataDeNascimento;//CamelCase
	String telefone;
	
	//Comportamentos (funções)
	//tipoDeRetorno nome (pode_possuir_parametros){
	//corpo da função
	//}
	
	void exibeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de nascimento: " + dataDeNascimento);
		System.out.println("Tel: " + telefone);		
	}	
}