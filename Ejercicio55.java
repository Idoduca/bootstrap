package actividad14;

import java.util.Scanner;
public class Ejercicio55 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char caracter;
		int inicio=0, linea=1;
		System.out.println("Introduce un texto: ");
		String texto=sc.nextLine();
		for(int i=0;i<texto.length();i++) {		
			if(texto.charAt(i)==' ') {
				System.out.println(linea + ":" + texto.substring(inicio, i));
				inicio=i+1;
				linea++;
			}
		}
		System.out.println(linea + ":" + texto.substring(inicio, texto.length()));
		

	}

}