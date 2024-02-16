package actividad11;

import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			for(int j=0;j<=num-(i-1)*2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}