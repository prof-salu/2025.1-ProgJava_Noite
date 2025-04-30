package aula09_interfaces_classes_abstratas;

public class Software extends Produto implements Atualizavel{
	private String versao;
	
	public Software(String nome, double precoDeCusto, String versao) {
		super(nome, precoDeCusto);
		this.versao = versao;
	}

	public String getVersao() {
		return versao;
	}
	
	@Override
	public final double calcularPrecoDeVenda() {
		return getPrecoDeFabrica() * 1.3;
	}

	@Override
	public void atualizar(String novaVersao) {
		String antiga = versao;
		this.versao = novaVersao;
		System.out.println("Versão anterior: " + antiga + " --> Nova versão: " + this.versao );
		
	}
}
