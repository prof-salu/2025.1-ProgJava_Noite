package javabank;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Juca", "12345", 5000);
		//f1.setNome("Juca");
		//f1.setCpf("12345");
		//f1.setSalario(5000);
		
		Gerente g1 = new Gerente("Angela", "98765", 10000, "1234");
		//g1.setNome("Angela");
		//g1.setCpf("98765");
		//g1.setSalario(10000);
		//g1.setSenha("1234");
		
		System.out.println("Funcionario: " + f1.getNome());
		System.out.println("Salario[f]: " + f1.getSalario());
		System.out.println("Bonus[f]: " + f1.calculaBonusSalarial());
		System.out.println();
		System.out.println("Gerente: " + g1.getNome());
		System.out.println("Salario[g]: " + g1.getSalario());
		System.out.println("Bonus[g]: " + g1.calculaBonusSalarial());
		
		//POLIMORFISMO
		
		//O banco precisa saber o quanto que foi pago de bonus em um mes.
		
		CalculaPagamentoDeBonus pagamento = new CalculaPagamentoDeBonus();
		pagamento.adicionarBonusPago(f1);
		pagamento.adicionarBonusPago(g1);
		
		System.out.println("Bonus pago no mes: " + pagamento.getTotalPago());
	}
}