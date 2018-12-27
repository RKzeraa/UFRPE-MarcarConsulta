package br.ufrpe.marcacao_consulta.negocio;

import br.ufrpe.marcacao_consulta.beans.Administrador;
import br.ufrpe.marcacao_consulta.beans.Paciente;
import br.ufrpe.marcacao_consulta.beans.Profissional;
import br.ufrpe.marcacao_consulta.dados.RepositorioAdministrador;

public class NegocioAdministrador extends Login {

	private RepositorioAdministrador repA = new RepositorioAdministrador();
	private Administrador ADM = new Administrador();
	
	public void cadastrarADM(String cpf, String nome, String email, String senha) {
		this.ADM = new Administrador(cpf, nome, email, senha);
		this.repA.inserirAdm(this.ADM);
	}
	
	public Administrador pesquisar(String cfp) {
		//Pesquisar Administrador
		return this.ADM; 
	}
	
	public void consultarAgendaDoProfissional(Profissional profissional) {
		//Verificar quais dias do mes o medico esta disponivel
	}
	
	public void registrarConsultaDoPaciente(Paciente paciente) {
		//Registrar Consulta na Agenda do Profissional
	}
	
	public boolean removerAdministrador(String cfp) {
		//Remover Administrador
		return true; 
	}
	
}
