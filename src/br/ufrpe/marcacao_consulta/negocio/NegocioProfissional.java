package br.ufrpe.marcacao_consulta.negocio;

import br.ufrpe.marcacao_consulta.beans.Profissional;
import br.ufrpe.marcacao_consulta.dados.RepositorioProfissional;

public class NegocioProfissional extends Login {

	private RepositorioProfissional repPRO = new RepositorioProfissional();
	private Profissional PRO = new Profissional();
	
	public void cadastrarPRO(String cpf, String nome, String email, String senha , String cargo, String rua, int numero, String complemento, String cep, String cidade) {
		this.PRO = new Profissional( cpf, nome, email, senha , cargo, rua, numero, complemento, cep, cidade);
		this.repPRO.inserirPRO(this.PRO);
	}
	
	public Profissional pesquisarProfissional(String cfp) {
		//pesquisar profissional
		return this.PRO; 
	}
	
	public void criarProntuario() {
		//Criar Prontuario do Paciente que foi consultado
	}
	
	public void liberarAgenda() {
		//Liberar um dia no calendario
	}
	
	public void consultarAgenda() {
		//Consultar todo o calendario
	}
	
	public boolean removerProfissional(String cfp) {
		//remover profissional
		return true; 
	}
}
