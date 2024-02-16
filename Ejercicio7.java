package actividad4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double dinero;
		System.out.println("�Cu�nto dinero va a pagar?");
		dinero=sc.nextDouble();
		if(dinero>100 && dinero <=200) {
			dinero-=dinero*0.1;
			//Es lo mismo que: dinero = dinero - dinero*0.1
		}
		if(dinero>200) {
			dinero=dinero-dinero*0.2;
		}
		System.out.println("El precio total de la compra es: " + dinero);

	}	

}