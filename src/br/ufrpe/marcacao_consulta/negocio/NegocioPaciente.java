package br.ufrpe.marcacao_consulta.negocio;

import br.ufrpe.marcacao_consulta.beans.Paciente;
import br.ufrpe.marcacao_consulta.dados.RepositorioPaciente;

public class NegocioPaciente extends Login {
	
	private RepositorioPaciente repP = new RepositorioPaciente();
	private Paciente PAC = new Paciente();
	
	public void cadastrarPAC(String cpf, String nome, String email, String senha, String sexo, int idade, String dataNascimento, String rua, int numero, String complemento, String cep, String cidade) {
		this.PAC = new Paciente( cpf, nome, email, senha, sexo, idade, dataNascimento, rua, numero, complemento, cep, cidade);
		this.repP.inserirPAC(this.PAC);
	}
	
	public Paciente pesquisarPaciente(String id) {
					
		return this.PAC; 
	}
	
	public void marcarConsulta() {
		//Marcar um dia na agenda
	}
	
	public void exibirProntuario() {
		//Exibir Prontuario do Paciente
	}
	
	public boolean removerPaciente(int id) {
		//remover Paciente
		return true; 
	}
}
