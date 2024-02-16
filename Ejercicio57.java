package actividad14;

import java.util.Scanner;
public class Ejercicio57 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		System.out.println("Introduce una letra: ");
		char letra=sc.nextLine().charAt(0);
		int contador=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==letra) {
				contador++;
			}
		}
		System.out.println("La frase: " + frase + ", contiene la letra " 
							+ letra + " "+ contador + " veces.");
		
	}

}
