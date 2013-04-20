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
public class Estado {
	
	private String nome;
	
	private String sigla;

	private Collection<Cidade> cidades = new TreeSet<Cidade>();
	
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
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the cidades
	 */
	public Collection<Cidade> getCidades() {
		return cidades;
	}

	/**
	 * @param cidades the cidades to set
	 */
	public void setCidades(Collection<Cidade> cidades) {
		this.cidades = cidades;
	}

}
