package aula11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/agenda";
		String usuario = "root";
		String senha = "mysql";
		
		try {
			//Conecta ao banco de dados
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("Conectado ao banco de dados.");
			
			//Encerra a conexao com o banco de dados
			conexao.close();
			System.out.println("Encerrando a conexão com o banco de dados.");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

}
