package br.ufrpe.marcacao_consulta.beans;

public class Endereco {
	
	private String rua;
	private int numero;
	private String complemento;
	private String cep;
	private String cidade;

	
	Endereco(String rua, int numero, String complemento, String cep, String cidade) {
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
		setCep(cep);
		setCidade(cidade);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if(rua != null) {
			this.rua = rua;
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
			this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if(cep != null) {
			this.cep = cep;
		}
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade != null) {
			this.cidade = cidade;
		}
	}

	
}
