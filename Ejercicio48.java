package actividad12;

import java.util.Scanner;

public class Ejercicio48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador=0;
		do {
			contador=0;
			System.out.println("Introduce un numero: ");
			int numero=sc.nextInt();
			while(numero>0) {
				numero=numero/10;
				contador++;
			}
		}while(contador!=4);
	}

}