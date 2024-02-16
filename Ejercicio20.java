package actividad6;

import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,intervalo, auxiliar;
		System.out.println("Introduce el primer n�mero: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		num2=sc.nextInt();
		
		while(num1>num2) {
			System.out.println("Numeros incorrectos, Introduce el primer n�mero: ");
			num1=sc.nextInt();
			System.out.println("Introduce el segundo n�mero: ");
			num2=sc.nextInt();
		}
		System.out.println("Introduce el intervalo: ");
		intervalo=sc.nextInt();
		
		int i=num1;
		while(i<=num2) {
			System.out.println(i + ", ");
			i=i+intervalo;
		}
		

	}

}