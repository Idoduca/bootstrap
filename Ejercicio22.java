package actividad7;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero, acumulador=0, contador=0;
		double media;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		while(numero!=0) {
			acumulador+=numero;
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
			contador++;
		}
		System.out.println("La suma de los n�meros es " + acumulador);
		media=acumulador/contador;
		System.out.println("La media de los n�meros es: " + media);
	}

}

