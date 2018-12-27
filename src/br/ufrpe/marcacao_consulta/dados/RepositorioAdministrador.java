package br.ufrpe.marcacao_consulta.dados;

import java.util.ArrayList;

import br.ufrpe.marcacao_consulta.beans.Administrador;

public class RepositorioAdministrador {
	
	private ArrayList<Administrador> listaAdm;
	
	public void inserirAdm(Administrador adm) {
		this.listaAdm.add(adm);
	}
	
	public void alterarAdm(Administrador adm) {
		for(int i=0; i < this.listaAdm.size(); i++) {
			if(this.listaAdm.get(i).getId().equals(adm.getId())) {
				this.listaAdm.set(i, adm);
			}
		}
	}
	
	public void excluirAdm(Administrador adm) {
		for(int i=0; i < this.listaAdm.size(); i++) {
			if(this.listaAdm.get(i).getId().equals(adm.getId())) {
				this.listaAdm.remove(i);
			}
		}
	}
	
	public Administrador consultarAdm(Administrador adm) {   
		Administrador adm1 = null;
        for (int i = 0; i < this.listaAdm.size(); i++) {   
            if (this.listaAdm.get(i).getId().equals(adm.getId())) {   
            	adm1 = this.listaAdm.get(i);   
            }   
        }
        return adm1;   
    }
	
	public boolean contemAdm(Administrador adm) {
	    for (int i = 0; i < this.listaAdm.size(); i++) {
	      if (adm == this.listaAdm.get(i)) {
	        return true;
	      }
	    }
	    return false;
	  }
	
	public ArrayList<Administrador> listarAdm(){
		return listaAdm;
	}
	
}
