package br.ufrpe.marcacao_consulta.beans;

public class Paciente {
	
	private String id = "PAC-";
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private String sexo;
	private int idade;
	private String dataNascimento;
	private Endereco enderecoPaciente;
	
	public Paciente(){
		
	}
	
	public Paciente(String cpf, String nome, String email, String senha, String sexo, int idade, String dataNascimento, String rua, int numero, String complemento, String cep, String cidade){
		setCpf(cpf);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		setSexo(sexo);
		setIdade(idade);
		setDataNascimento(dataNascimento);
		this.setEnderecoPaciente(new Endereco( rua,  numero,  complemento,  cep,  cidade));
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if(sexo != null) {
			this.sexo = sexo;
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento != null) {  //Formatar a data em dd/mm/aaaa
			this.dataNascimento = dataNascimento;
		}
	}

	public Endereco getEnderecoPaciente() {
		return enderecoPaciente;
	}

	public void setEnderecoPaciente(Endereco enderecoPaciente) {
		this.enderecoPaciente = enderecoPaciente;
	}
	
}
