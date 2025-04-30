package aula09_interfaces_classes_abstratas;

//A interface funciona como uim contrato.
//Reescrever as todas as funções da interface
public class Hardware extends Produto implements Conectavel, Atualizavel{
	private String fabricante;
	
	public Hardware(String nome, double precoDeFabrica, String fabricante) {
		super(nome, precoDeFabrica);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	@Override
	public double calcularPrecoDeVenda() {
		return getPrecoDeFabrica() * 1.4;
	}

	@Override
	public void conectado(Hardware produto) {
		System.out.println(getNome() + " --> CONECTADO --> " + produto.getNome());		
	}

	@Override
	public void atualizar(String novaVersao) {
		System.out.println("Versão atual: " + novaVersao);
		
	}
}
