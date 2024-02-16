package actividad10;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i%2==0) {
					//Pares
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print("  ");
					}
				}else {
					if(j%2!=0) {
						System.out.print("*");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}
	}	
}

