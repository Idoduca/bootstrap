package actividad15;

import java.util.Scanner;
public class Ejercicio62 {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numeroReves=0, aux;
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		aux=numero;
		while(aux>0) {
			numeroReves*=10;
			int ultima=aux%10;
			numeroReves+=ultima;
			aux/=10;
		}
		if(numeroReves==numero) {
			System.out.println("El numero introducido es capicua.");
		}else {
			System.out.println("El numero introducido NO es capicua.");
		}
		
	}

}
