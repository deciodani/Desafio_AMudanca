/**
 * 
 */
package br.com.deciodani.git;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author decio
 *
 */
public class Desafio_AMudancaGit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
	    String msg;

	//TODO: Complete os espaços em branco com uma possível solução para o desafio 	

	  	while (leitor.hasNext()) {
	  		
	  		int graus = leitor.nextInt();
	  		
	  		
	  	 	if (graus >= 90 && graus < 180) msg = "Boa Tarde!!" ;
	    	else if (graus >= 180 && graus < 270) msg = "Boa Noite!!" ;
	        else if (graus >= 270 && graus < 360) msg = "De Madrugada!!" ;
	        else msg = "Bom Dia!!";
	    			  		
	  		System.out.println(msg);

	  	}
	  	leitor.close();
	}
}
