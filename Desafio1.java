package desafios;

import java.util.Scanner;
public class Desafio2 {

	static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

	int numero=0, aux=0, confirma=0;
	int [] vetor=new int[20];
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Digite o número inteiro que deseja consultar:");
	numero=teclado.nextInt();
	
	
	for (int i = 0; i < 20; i++) {
            aux=(int) Desafio2.fibonacci(i);
            vetor[i]=aux;
           
        }
	
	for (int i = 0; i < 20; i++) {
		if (vetor[i]==numero) {
	    confirma++;	
     }
	}
    
		if (confirma ==1) {
			System.out.println("O valor faz parte da sequência de Fibonacci");
		
    }
		else {
			System.out.println("O valor NÃO faz parte da sequência de Fibonacci");
		}
	
		System.out.println("Fim"); 
	
    }

    
}
