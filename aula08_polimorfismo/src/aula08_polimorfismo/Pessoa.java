package aula08_polimorfismo;

//POLIFORMISMO--> POLI(muitos), MORFISMO (formas)

//Todas as classes tem um 'parente' em comum. Classe Object (SUPER CLASSE)
public class Pessoa extends Object{
	private String nome;
	private String email;
	private String cpf;
	
	public Pessoa(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		//return "Pessoa(Nome: " + nome + ", E-mail: " + email + ", CPF: " + cpf + ")";
		return "Pessoa(Nome: %s, E-mail: %s, CPF: %s)".formatted(nome, email, cpf);
	}
	
	@Override
	public boolean equals(Object obj) {
		//Caso o objeto seja nulo
		if (obj == null) {
			return false;
		}
		
		//Caso o objeto seja uma instancia da classe testada
		if(obj instanceof Pessoa) {
			//Converte o obj para a classe Pessoa
			Pessoa outro = (Pessoa) obj;
			
			if(outro.getNome().equals(getNome()) &&
			   outro.getCpf().equals(getCpf()) &&
			   outro.getEmail().equals(getEmail())) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int primo = 17;
		int resultado = 1;
		
		resultado = resultado * nome.length() * primo;
		resultado = resultado * email.length() * primo;
		resultado = resultado * Integer.parseInt(cpf.substring(0, 5)) * primo;
		return resultado;
	}
}
