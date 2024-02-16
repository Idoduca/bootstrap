package actividad5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precio, asientos, edad, comida, frecuente, maleta;
		System.out.println("Introduce el precio inicial del vuelo: ");
		precio= sc.nextInt();
		System.out.println("Desea elegir asiento? (1- Si , 0- No)");
		asientos=sc.nextInt();
		System.out.println("Introduzca su edad: ");
		edad=sc.nextInt();
		System.out.println("Desea llevar maleta? (1- Si , 0- No)");
		maleta=sc.nextInt();
		System.out.println("Desea comida? (1- Si , 0- No)");
		comida=sc.nextInt();
		System.out.println("Tiene tarjeta de viajero frecuente? (1- Si , 0- No)");
		frecuente=sc.nextInt();
		if(edad<14) {
			precio/=2; //Es lo mismo que precio=precio/2
		}
		if(maleta==1) {
			if(edad<14) {
				precio +=20;
			}else {
				precio +=50;
			}
		}
		if(comida==1 && frecuente==0 && edad<60) {
			precio +=20;
		}
		if(asientos==1) {
			precio+=10;
		}
		System.out.println("El precio total es: " + precio);
				
	}
}
