package actividad12;

import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		int contador=0;
		while(numero>0) {
			numero=numero/10;
			contador++;
		}
		System.out.println("El numero tiene " + contador + " cifras.");
		
	}
}