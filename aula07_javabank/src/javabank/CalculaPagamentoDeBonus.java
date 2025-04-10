package javabank;

public class CalculaPagamentoDeBonus {
	//Armazena o valor pago em bonificacoes
	private double totalPago = 0; 
	
	public void adicionarBonusPago(Funcionario funcionario) {
		totalPago = totalPago + funcionario.calculaBonusSalarial();
	}
	
	public double getTotalPago() {
		return totalPago;
	}
}
