/**
 * 
 */
package com.prueba.tecnica.timeInWords.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.tecnica.timeInWords.model.Time;

/**
 * Interface para definir las operaciones de BD relacionadas con Tiempo
 * @author vfs
 *
 */
public interface TimeRepository extends JpaRepository<Time,String>{

	/***
	 * Definicion de metodo para consultar todas las horas con minutos
	 * y la hora en palabras
	 * @return
	 */
	@Query("SELECT t FROM Time t")
	public List<Time> findAll();
}
