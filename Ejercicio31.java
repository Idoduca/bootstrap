package actividad9;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, acum=0;;
		do {
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
			if(num%2==0) {
				acum+=num;
			}
		}while(num!=0);
		System.out.println("La suma de pares es: " + acum);
	}

}
