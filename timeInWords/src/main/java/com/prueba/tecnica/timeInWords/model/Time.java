package com.prueba.tecnica.timeInWords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * Clase que representa la Tabla Tiempo de la Base de Datos
 * @author vfs
 *
 */

@Entity
@Table(name = "Tiempo")
public class Time {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer hora;
	private Integer minutos;
	private String palabras;
	
	public Time() {
		
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the hora
	 */
	public Integer getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Integer hora) {
		this.hora = hora;
	}

	/**
	 * @return the minutos
	 */
	public Integer getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the palabras
	 */
	public String getPalabras() {
		return palabras;
	}

	/**
	 * @param palabras the palabras to set
	 */
	public void setPalabras(String palabras) {
		this.palabras = palabras;
	}
	
	
	
}
