package actividad8;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//N�mero primo es aquel que s�lo es divisible por el mismo y por 1
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=num)){
		   if (num % contador == 0)
			   	primo = false;
		   		contador++;
		}
		
		if (primo) {
			System.out.println("El n�mero es primo");
		}
		else System.out.println("El n�mero no es primo");

	}

}
