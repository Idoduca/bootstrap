package actividad9;

import java.util.Scanner;
public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, acum=0, mayor=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;
		do {
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
			if(num%2==0 && num>mayor) {
				mayor=num;
			}
			if(num%2!=0 && num<menor) {
				menor=num;
			}
		}while(num!=0);
		System.out.println("Numero par mayor: " + mayor);
		System.out.println("Numero impar menor: " + menor);
	}
}
