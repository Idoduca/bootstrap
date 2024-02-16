package actividad8;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, acumPos=0, acumNeg=0;
		
		do {
			System.out.println("Introducir un numero (finaliza al meter 0): ");
			num = sc.nextInt();
			
			if (num<0) {
				acumNeg = acumNeg + num;
			}
			else acumPos = acumPos + num;
		}while (num!=0);
		
		System.out.println("El acumulador negativo es igual a " + acumNeg);
		System.out.println("El acumulador positivo es igual a " + acumPos);
	}

}
