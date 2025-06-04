package aula11_jdbc;

import java.time.LocalDate;
import java.util.Objects;

public class Contato {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private LocalDate dtNasc;
	
	//JAVABEAN ==> ATRIBUTOS PRIVADOS, GET e SETS, CONSTRUTOR VAZIO	E CHEIO, 
		//				TO_STRING, EQUALS, HASHCODE
	public Contato(int id, String nome, String email, String telefone, LocalDate dtNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dtNasc = dtNasc;
	}

	public Contato() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", dtNasc="
				+ dtNasc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dtNasc, email, id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(dtNasc, other.dtNasc) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}	
}
