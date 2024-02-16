package actividad7;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero, acumulador=0;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		while(numero!=0) {
			acumulador+=numero;
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
		}
		System.out.println("La suma de los n�meros es " + acumulador);

	}

}
