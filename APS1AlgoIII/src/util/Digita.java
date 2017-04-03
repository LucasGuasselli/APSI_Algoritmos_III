/**
 * 
 * @author Lucas Guasselli de Moraes
 * @since 02/04/2017
 * @version 1.0 
 * 
 */
package util;

import java.util.Scanner;

public class Digita {

	
	public String Digita(String texto){
		Scanner ler = new Scanner(System.in);
			System.out.println(texto);
				return ler.nextLine();
	}//fecha digita
	
	
}//fecha classe
