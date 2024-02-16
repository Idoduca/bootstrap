package actividad15;

import java.util.Scanner;
public class Ejercicio61 {


	public static void main(String[] args) {
		String fraseAlReves="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		frase=frase.replace(" ", "");
		
		//Modo 1: creo una frase al rev�s que la primera y las comparo.
		for(int i=frase.length()-1;i>=0;i--) {
			char letra=frase.charAt(i);
			fraseAlReves+=letra;
		}
		if(frase.equalsIgnoreCase(fraseAlReves)) {
			System.out.println("La frase introducida es un pal�ndromo.");
		}else {
			System.out.println("La frase introducida no es un pal�ndromo.");
		}
	
	}

}

