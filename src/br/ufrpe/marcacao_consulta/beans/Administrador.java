package br.ufrpe.marcacao_consulta.beans;

public class Administrador {
	
	private String id = "ADM-";
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	
	public Administrador(){
		
	}
	
	
	public Administrador(String cpf, String nome, String email, String senha) {
		setCpf(cpf);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id != null) {
			this.id = this.id+id;			
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf != null) {
			this.cpf = cpf;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email != null) {
			this.email = email;
		}
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha != null) {
			this.senha = senha;
		}
	}
	
	
}
