package actividad8;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Ver si el n�mero es par
		if (num%2==0) {
		    for (int i=1;i<=num;i++) {
		    	// Pinta los pares
		    	if (i%2==0) {
		    		System.out.print("*");
		    	}
		    	else System.out.print(" ");    	
			}
		    
		}else
			for (int i=1;i<=num;i++) {
		    	// Pinta los impares
		    	if (i%2==0) {
		    		System.out.print(" ");
		    	}
		    	else System.out.print("*");    	
			}

	}

}

