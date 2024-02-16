package actividad7;

import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int max=-1000000, min=1000000, num;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		while(num!=0) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
		}
		System.out.println("El m�ximo es " + max);
		System.out.println("El m�nimo es " + min);

	}

}
