package actividad12;

import java.util.Scanner;
public class Ejercicio50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		for(int i=0;i<numero;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<numero;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<numero-1;i++) {
			for(int j=1;j<numero-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<numero;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
