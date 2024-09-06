package desafios2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args)  {
		
		Scanner teclado = new Scanner(System.in);
	    String texto;
	    String comparacao = "A";
	    int i, conta=0;
	    System.out.println("Digite a palavra ou frase que deseja consultar:");
	  
	    texto = teclado.nextLine();
	   
	    String convertido = texto.toUpperCase();
	    
	    for (i=0; i<texto.length(); i++) {
	                 if (convertido.charAt(i)==comparacao.charAt(0)) {
	                conta++;
	            } 
	        }
	       
	        System.out.println("Você digitou: " + texto);
	       
	        if (conta >=1) {
	        	
	         System.out.println("A letra a aparece "+conta+" vezes.");
	    }
	        else {
	        	System.out.println("A letra A não apareceu na sua digitação.");
	        }
	}
}
	
