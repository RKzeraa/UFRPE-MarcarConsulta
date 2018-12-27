package br.ufrpe.marcacao_consulta.dados;

import java.util.ArrayList;

import br.ufrpe.marcacao_consulta.beans.Profissional;

public class RepositorioProfissional {
	
	private ArrayList<Profissional> listaPRO;
	
	public void inserirPRO(Profissional pro) {
		this.listaPRO.add(pro);
	}
	
	public void alterarPRO(Profissional pro) {
		for(int i=0; i < this.listaPRO.size(); i++) {
			if(this.listaPRO.get(i).getId().equals(pro.getId())) {
				this.listaPRO.set(i, pro);
			}
		}
	}
	
	public void excluirPRO(Profissional pro) {
		for(int i=0; i < this.listaPRO.size(); i++) {
			if(this.listaPRO.get(i).getId().equals(pro.getId())) {
				this.listaPRO.remove(i);
			}
		}
	}
	
	public Profissional consultarPRO(Profissional pro) {   
		Profissional pro1 = null;
        for (int i = 0; i < this.listaPRO.size(); i++) {   
            if (this.listaPRO.get(i).getId().equals(pro.getId())) {   
            	pro1 = this.listaPRO.get(i);   
            }   
        }
        return pro1;   
    }
	
	public boolean contemPRO(Profissional pro) {
	    for (int i = 0; i < this.listaPRO.size(); i++) {
	      if (pro == this.listaPRO.get(i)) {
	        return true;
	      }
	    }
	    return false;
	  }
	
	public ArrayList<Profissional> listarPRO(){
		return listaPRO;
	}
}
