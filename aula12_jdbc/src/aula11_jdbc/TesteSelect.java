package aula11_jdbc;

import java.util.List;

public class TesteSelect {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> lista = dao.buscarTodosOsContatos();
		
		if(lista.isEmpty()) {
			System.out.println("Nenhum contato encontrado");
		}else {
			for (Contato contato : lista) {
				System.out.println(contato);
			}
		}
	}
}
