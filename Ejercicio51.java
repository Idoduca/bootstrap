package actividad13;

import java.util.Scanner;
public class Ejercicio51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		do {
			int cifra=numero%10;
			if(cifra%2==0) {
				System.out.print(cifra);
			}
			numero=numero/10;
		}while(numero>0);
	}

}
