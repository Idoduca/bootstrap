package actividad5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int aleatorio, numero;
		aleatorio=(int)(Math.random()*10)+1;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		if(numero<aleatorio) {
			System.out.println("El numero " + numero + " es menor que " + aleatorio);
		}
		if(numero>aleatorio) {
			System.out.println("El numero " + numero + " es mayor que " + aleatorio);
		}
		if(numero==aleatorio) {
			System.out.println("El numero " + numero + " es igual que " + aleatorio);
		}	
	}
}
