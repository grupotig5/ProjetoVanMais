/**
 * 
 */
package com.example.projetovanmais.localidade;




import java.util.Collection;
import java.util.TreeSet;

import com.example.projetovanmais.serviço.Itinerario;



/**
 * @author Wesley Dias
 *
 */
public class Bairro 
{
	private String nome;
	
	private Collection<Itinerario> itinerarios = new TreeSet<Itinerario>();
	

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
	 * @return the itinerarios
	 */
	public Collection<Itinerario> getItinerarios() {
		return itinerarios;
	}

	/**
	 * @param itinerarios the itinerarios to set
	 */
	public void setItinerarios(Collection<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}

	

}
