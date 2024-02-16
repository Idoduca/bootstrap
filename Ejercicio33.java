package actividad9;

import java.util.Scanner;
public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sueldo, acumulador=0, mayoresMil=0, i=1;
		while(i<=10) {
			System.out.println("Introduce el sueldo " + i + " :");
			sueldo=sc.nextInt();
			acumulador+=sueldo;
			if(sueldo>1000) {
				mayoresMil++;
			}
		}
		System.out.println("Total acumulado sueldos: " + acumulador);
		System.out.println("Numero de sueldos > 1000 : " + mayoresMil);
	}

}
