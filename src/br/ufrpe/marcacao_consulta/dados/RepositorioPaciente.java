package br.ufrpe.marcacao_consulta.dados;

import java.util.ArrayList;

import br.ufrpe.marcacao_consulta.beans.Paciente;

public class RepositorioPaciente {
	
	private ArrayList<Paciente> listaPAC;
	
	public void inserirPAC(Paciente pac) {
		this.listaPAC.add(pac);
	}
	
	public void alterarPAC(Paciente pac) {
		for(int i=0; i < this.listaPAC.size(); i++) {
			if(this.listaPAC.get(i).getId().equals(pac.getId())) {
				this.listaPAC.set(i, pac);
			}
		}
	}
	
	public void excluirPAC(Paciente pac) {
		for(int i=0; i < this.listaPAC.size(); i++) {
			if(this.listaPAC.get(i).getId().equals(pac.getId())) {
				this.listaPAC.remove(i);
			}
		}
	}
	
	public Paciente consultarPAC(String id) {   
		Paciente pac1 = null;
        for (int i = 0; i < this.listaPAC.size(); i++) {   
            if (this.listaPAC.get(i).getId().equals(id)) {   
            	pac1 = this.listaPAC.get(i);   
            }   
        }
        return pac1;   
    }
	
	public boolean contemPAC(Paciente pac) {
	    for (int i = 0; i < this.listaPAC.size(); i++) {
	      if (pac == this.listaPAC.get(i)) {
	        return true;
	      }
	    }
	    return false;
	  }
	
	public ArrayList<Paciente> listarPAC(){
		return listaPAC;
	}

}
