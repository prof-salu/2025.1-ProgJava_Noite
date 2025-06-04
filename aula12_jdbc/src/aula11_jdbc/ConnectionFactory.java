package aula11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//Retorna uma conexao com o banco de dados
	
	public Connection getConection() {
		String url = "jdbc:mysql://localhost:3306/agenda";
		String usuario = "root";
		String senha = "mysql";
		Connection conexao = null;
		
		try {
			//Conecta ao banco de dados
			conexao = DriverManager.getConnection(url, usuario, senha);			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return conexao;
	}
}
