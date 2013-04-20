/**
 * 
 */
package com.example.projetovanmais.serviço;

import java.util.Collection;
import java.util.TreeSet;

import com.example.projetovanmais.localidade.Bairro;

/**
 * @author Wesley Dias
 *
 */
public class Itinerario {
	
	private String descricaoItinerario;
	
	private Collection<Bairro> bairros = new TreeSet<Bairro>();

	private Collection<AvaliacaoServico> avaliacoes = new TreeSet<AvaliacaoServico>();
	
	

	/**
	 * @return the descricaoItinerario
	 */
	public String getDescricaoItinerario() {
		return descricaoItinerario;
	}

	/**
	 * @param descricaoItinerario the descricaoItinerario to set
	 */
	public void setDescricaoItinerario(String descricaoItinerario) {
		this.descricaoItinerario = descricaoItinerario;
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

	/**
	 * @return the avaliacoes
	 */
	public Collection<AvaliacaoServico> getAvaliacoes() {
		return avaliacoes;
	}

	/**
	 * @param avaliacoes the avaliacoes to set
	 */
	public void setAvaliacoes(Collection<AvaliacaoServico> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	

}
