package br.ufrpe.marcacao_consulta.beans;

public class Profissional{
	
	private String id = "PRO-";
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private String cargo;
	private Endereco enderecoProfissional;
	
	public Profissional(){
		
	}
	
	public Profissional(String cpf, String nome, String email, String senha , String cargo, String rua, int numero, String complemento, String cep, String cidade){
		setCpf(cpf);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		setCargo(cargo);
		this.setEnderecoProfissional(new Endereco( rua,  numero,  complemento,  cep,  cidade));
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		if(cargo != null) {
			this.cargo = cargo;
		}
	}

	public Endereco getEnderecoProfissional() {
		return enderecoProfissional;
	}

	public void setEnderecoProfissional(Endereco enderecoProfissional) {
		this.enderecoProfissional = enderecoProfissional;
	}
	
	

}
