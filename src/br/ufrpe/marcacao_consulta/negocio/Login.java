package br.ufrpe.marcacao_consulta.negocio;

import br.ufrpe.marcacao_consulta.beans.Administrador;
import br.ufrpe.marcacao_consulta.beans.Paciente;
import br.ufrpe.marcacao_consulta.beans.Profissional;
import br.ufrpe.marcacao_consulta.dados.RepositorioAdministrador;
import br.ufrpe.marcacao_consulta.dados.RepositorioPaciente;
import br.ufrpe.marcacao_consulta.dados.RepositorioProfissional;

public class Login {
	
	private boolean resultado = false;
	private boolean existe = true;
	private boolean emailErrado = false;
	private boolean senhaErrada = false;
	
	public boolean efetuarLogin(String id, String email, String senha) {
		
		if(id.contains("ADM")) {
			
			RepositorioAdministrador repA = new RepositorioAdministrador();
			Administrador ADM = new Administrador();
			
			ADM = repA.consultarAdm(ADM);
			
			if(email != null && senha != null) {
				if(ADM.getEmail().equals(email)) {
					if(ADM.getSenha().equals(senha)) {
						this.resultado = true;
					}else {
						this.senhaErrada = true;
					}
				}else {
					this.emailErrado = true;
				}
			}else {
				this.existe = false;
			}
			
			
		}else if(id.contains("PAC")) {
			
			RepositorioPaciente repP = new RepositorioPaciente();
			Paciente PAC = new Paciente();
			
			
			
			if(email != null && senha != null) {
				if(PAC.getEmail().equals(email)) {
					if(PAC.getSenha().equals(senha)) {
						this.resultado = true;
					}else {
						this.senhaErrada = true;
					}
				}else {
					this.emailErrado = true;
				}
			}else {
				this.existe = false;
			}
			
			
		}else if(id.contains("PRO")) {
			
			RepositorioProfissional repPRO = new RepositorioProfissional();
			Profissional PRO = new Profissional();
			
			PRO = repPRO.consultarPRO(PRO);
			
			if(email != null && senha != null) {
				if(PRO.getEmail().equals(email)) {
					if(PRO.getSenha().equals(senha)) {
						this.resultado = true;
					}else {
						this.senhaErrada = true;
					}
				}else {
					this.emailErrado = true;
				}
			}
		}else {
			this.existe = false;
		}
		
		return this.resultado;
	}
	
	
	
	
	
	
	
}
