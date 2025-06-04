package aula11_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

public class ContatoDAO {
	//DAO --> Data Acess Object (objeto de acesso aos dados)
	//Especialista em acessar o banco de dados
	
	private Connection conexao;
	
	public ContatoDAO() {
		conexao = new ConnectionFactory().getConection();
	}
	
	public void gravarContato(Contato contato) {
		String sql = "INSERT INTO contatos (nome, email, telefone, dt_nasc) " + 
					 "VALUES (?, ?, ?, ?)";
		
		//Statements
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			//A contagem começa do UM (1)
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getTelefone());
			ps.setDate(4, Date.valueOf(contato.getDtNasc()));
			
			ps.execute();//Executa o statement no banco de dados
			
			System.out.println("Contato gravado com sucesso!: " + contato.getNome());
			
			//Fecha o PreparedStatement e a Conexao
			ps.close();
			conexao.close();
						
		}catch(SQLException e) {
			System.out.println("Erro: " + e);
		}
	}
	
	public List<Contato> buscarTodosOsContatos() {
		List<Contato> lista = null;//Lista que armazenara todos os contatos retornados pelo banco de dados
		String sql = "SELECT * FROM contatos";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();//Retorna um objeto (ResultSet) com todos os dados da consulta
			lista = new ArrayList<Contato>();
			
			//Verifica se tem dados dentro do ResultSet
			while(rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getInt("id"));//Valor referente ao nome da coluna na tabela
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setTelefone(rs.getString("telefone"));
				LocalDate data = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("dt_nasc")));
				contato.setDtNasc(data);
				
				lista.add(contato);				
			}
			
			rs.close();
			ps.close();
			conexao.close();
			
		}catch(SQLException e) {
			System.out.println("Erro: " + e);
		}
		
		return lista;
	}
	
	public void apagarContato(Contato contato) {
		//IMPLEMENTAR
	}
	
	public void alterarContato(Contato contato) {
		//IMPLEMENTAR
	}
	
}
