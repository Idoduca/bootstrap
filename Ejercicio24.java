package actividad7;

import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, aleatorio;
		aleatorio=(int)(Math.random()*10)+1;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		while(num!=aleatorio) {
			if(num<aleatorio) {
				System.out.println("El n�mero a acertar es mayor.");
			}
			if(num>aleatorio) {
				System.out.println("El n�mero a acertar es menor.");
			}
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
		}
		System.out.println("Has acertado!");

	}

}
