package aula11_jdbc;

import java.time.LocalDate;

public class TesteInsert {

	public static void main(String[] args) {
		//LocalDate.of (ANO, MES, DIA);
		Contato contato = new Contato();
		contato.setNome("João");
		contato.setEmail("jonin@email.com");
		contato.setTelefone("21908765432");
		contato.setDtNasc(LocalDate.of(2000, 10, 11));
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.gravarContato(contato);

	}

}
