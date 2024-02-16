package actividad6;

import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		int numero=sc.nextInt();
		int i=1;
		System.out.println("***TABLA DE MULTIPLICAR DEL " + numero + "***");
		while(i<=10) {
			System.out.println(numero + " X " + i + " = " + (numero*i));
			i++;
		}
	}
}
