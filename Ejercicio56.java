package actividad14;

import java.util.Scanner;
public class Ejercicio56 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		frase=frase.toUpperCase();
		int contador=0;
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			if(caracter=='A' || caracter=='E' || caracter=='I' 
					|| caracter=='O' || caracter=='U') {
				contador++;
			}
			/*switch (caracter) {
				case 'A': case 'E': case 'I': case 'O': case 'U': contador++;
			}*/
			
		}
		System.out.println("El numero total de vocales es: " + contador);
	}

}