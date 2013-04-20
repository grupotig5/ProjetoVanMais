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
public class Regiao {
	
	private String nome;
	
	private Collection<Bairro> bairros = new TreeSet<Bairro>();

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
	 * @return the bairros
	 */
	public Collection<Bairro> getBairros() {
		return bairros;
	}

	/**
	 * @param bairros the bairros to set
	 */
	public void setBairros(Collection<Bairro> bairros) {
		this.bairros = bairros;
	}
	


}
