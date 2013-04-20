/**
 * 
 */
package com.example.projetovanmais.localidade;

import java.util.Collection;
import java.util.TreeSet;

/**
 * @author Wesley Dias
 *
 */
public class Cidade {
	
	private String nome;
	
	private Collection<Regiao> regioes = new TreeSet<Regiao>();

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the regioes
	 */
	public Collection<Regiao> getRegioes() {
		return regioes;
	}

	/**
	 * @param regioes the regioes to set
	 */
	public void setRegioes(Collection<Regiao> regioes) {
		this.regioes = regioes;
	}
	

}
