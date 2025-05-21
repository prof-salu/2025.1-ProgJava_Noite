
public class TesteExcecao {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
				
		try {
			//colocar todo o bloco de coidgo que pode vir a gerar a excecao
			int divisao = x / y;
			System.out.println(divisao);
		}catch(ArithmeticException e) {
			//local do tratamento da excecao
			System.out.println(e);
		}catch(Exception e){
			//local do tratamento da excecao
			System.out.println(e);
		}finally {
			//O bloco finally sempre será executado ocorrendo uma excecao ou não
			System.out.println("Fim do programa");
		}
	}
}