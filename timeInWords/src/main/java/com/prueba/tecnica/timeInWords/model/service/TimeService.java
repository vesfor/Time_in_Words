/**
 * 
 */
package com.prueba.tecnica.timeInWords.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.tecnica.timeInWords.model.Time;
import com.prueba.tecnica.timeInWords.model.repository.TimeRepository;


/**
 * Clase para definir los servicios de Time
 * @author vfs
 *
 */

@Service
@Transactional(readOnly = true)
public class TimeService {
	private final TimeRepository timeRepository;
	
	
	/***
	 * Constructor de la clase TimeService
	 * @param timeRepository
	 */
	public TimeService(TimeRepository timeRepository) {
		this.timeRepository = timeRepository;
	}



	/**
	 * Metodo para realizar la operacion de guardar en la BD
	 * @param persona
	 * @return
	 */
	@Transactional
	public Time create(Time tiempo) {
		return this.timeRepository.save(tiempo);
	}


	/***
	 * Metodo que convierte la hora y minutos en palabras
	 * @param hora
	 * @param minutos
	 * @return
	 */
	public String TimeWords(int hora, int minutos) {
		
		 int H = hora;
	     int M = minutos;

	        if (H >= 1 && H < 12) {

	            if (M == 0) {
	                System.out.println(hora(H) + " o'clock");
	                return hora(H) + " o'clock";
	            }
	            if (M >= 1 && M <= 14 || M >= 16 && M <= 29) {
	                System.out.println(minutos(M) + " minutes past " + hora(H));
	                return minutos(M) + " minutes past " + hora(H);
	            }
	            if (M == 15 || M == 30) {
	                System.out.println(minutos(M) + " past " + hora(H));
	                return minutos(M) + " past " + hora(H);
	            }
	            if (M >= 31 && M <= 44 || M >= 46 && M <= 59) {
	                System.out.println(minutos(60 - M) + " minutes to " + hora(H + 1));
	                return minutos(60 - M) + " minutes to " + hora(H + 1);
	            }
	            if (M == 45) {
	                System.out.println(minutos(60 - M) + " to " + hora(H + 1));
	                return minutos(60 - M) + " to " + hora(H + 1);
	            }
	            else {
	                System.out.println("Please, insert only minutes between 1 to 59");
	                return "Please, insert only minutes between 1 to 59";
	            }

	        } else {
	            System.out.println("Please, insert only hour between 1 to 11");
	            return "Please, insert only hour between 1 to 11";
	        }
	}
	
	
	/***
	 * Metodo que convierte las horas en palabras
	 * @param 
	 * @return
	 */
	public static String hora(int H){
        switch (H){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";

                default:
                    return "";

        }
    }

	/***
	 * Metodo que convierte los minutos en palabras
	 * @param 
	 * @return
	 */
    public static String minutos(int M){
        switch (M){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "quarter";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 21:
                return "twenty one";
            case 22:
                return "twenty two";
            case 23:
                return "twenty three";
            case 24:
                return "twenty four";
            case 25:
                return "twenty five";
            case 26:
                return "twenty six";
            case 27:
                return "twenty seven";
            case 28:
                return "twenty eight";
            case 29:
                return "twenty nine";
            case 30:
                return "half";

                default:
                    return "";
        }
    }
}
