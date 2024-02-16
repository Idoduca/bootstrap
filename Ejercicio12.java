package actividad5;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int peso=0, ilimitada=0, refresco=0,basicos=0, deluxe=0, patatas=0;
		double precio=0;
		System.out.println("Cu�nto peso tendr� la hamburguesa? (1- 100gr, 2- 200gr, 3- 300gr ");
		peso=sc.nextInt();
		System.out.println("�Quieres bebida ilimitada? (1- s�, 0- no)");
		ilimitada=sc.nextInt();
		if(ilimitada==0) {
			System.out.println("Quieres refresco? (0-no, 1-agua, 2-cocacola, 3-cerveza)");
			refresco=sc.nextInt();
		}
		System.out.println("�Cu�ntos ingredientes b�sicos quieres?");
		basicos = sc.nextInt();
		System.out.println("�Cu�ntos ingredientes deluxe quieres?");
		deluxe=sc.nextInt();
		if(peso==2 || peso==3) {
			System.out.println("Tiene patatas peque�as incluidas, las desea medianas? (1- s�, 0- no)");
			patatas=sc.nextInt();
		}else {
			System.out.println("Quiere patatas? (0-no, 1-peque�as, 2-medianas)");
			patatas=sc.nextInt();
		}
		//El precio base de la hambrguesa de 100gr es de 3 euros 
		if(peso==1) {
			precio+=3;
		}
		//El precio base de la hambrguesa de 200gr es de 5 euros 
		if(peso==2) {
			precio+=5;
		}
		//El precio base de la hambrguesa de 300gr es de 7 euros 
		if(peso==3) {
			precio+=7;
		}
		//Si la bebida es ilimitada tiene diferentes precios en funcion a el peso de la hamburguesa
		if(ilimitada==1) {
			//Si el peso es de 300 euros cuesta 1.75, en caso contrario 3.50
			if(peso==3) {
				precio+=1.75;
			}else {
				precio+=3.5;
			}
		}else {
			//Si no ha pedido bebida ilimitada
			//Si pide agua se le cobra 1 euro
			if(refresco==1) {
				precio+=1;
			}
			//Si pide refresco se le cobra 1 euro
			if(refresco==2) {
				precio+=2;
			}
			//Si pide cerveza se le cobra 1 euro
			if(refresco==3) {
				precio+=2.5;
			}
		}
		//Le sumo al precio los b�sicos *0.50 y los deluxe * 1
		precio += (basicos*0.5) + deluxe;
		if(peso==2 || peso==3 && patatas==1) {
			precio+=1;
		}
		if(peso==1) {
			precio+=patatas;
		}
		System.out.println("El precio total a pagar es: " + precio);
		if(precio>12) {
			System.out.println("Se lleva un llavero.");
		}
				
	}

}
