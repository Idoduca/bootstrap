package actividad17;

import java.util.Scanner;

public class Ejercicio72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		int[]repesVocales = new int[5];
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			switch(caracter) {
			case 'a':repesVocales[0]++; break;
			case 'e':repesVocales[1]++; break;
			case 'i':repesVocales[2]++; break;
			case 'o':repesVocales[3]++; break;
			case 'u':repesVocales[4]++; break;
			}
		}
		char[] vocales = {'a','e','i','o','u'};
		for(int i=0;i<vocales.length;i++) {
			System.out.print("Repeciciones " + vocales[i] + ": ");
			for(int j=0;j<repesVocales[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}