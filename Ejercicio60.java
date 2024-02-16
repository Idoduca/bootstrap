package actividad15;

import java.util.Scanner;
public class Ejercicio60 {


	public static void main(String[] args) {
		String fraseAlReves="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
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
		//Modo 2: Comparar la frase letra a letra
		boolean palindromo=true;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)!=frase.charAt(frase.length()-i-1)) {
				palindromo=false;
			}
		}
		if(palindromo) {
			System.out.println("La frase introducida es un pal�ndromo.");
		}else {
			System.out.println("La frase introducida no es un pal�ndromo.");
		}
	}

}
