package actividad10;

import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}