package actividad14;

import java.util.Scanner;
public class Ejercicio59 {
	/*
Ejercicio 59: Pedir al usuario dos palabras y dos letras:
a. Mostrar al usuario todas las posiciones de la primera letra en la primera palabra.
b. Mostrar la primera palabra sustituyendo la primera letra por la segunda. 
c. Mostrar la primera palabra al rev�s.
d. Mostrar la segunda palabra en may�sculas.
e. Concatenar a continuaci�n de la primera palabra la segunda.
f. Mostrar la segunda palabra omitiendo las veces que aparezca la segunda letra.*/

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra1=sc.nextLine();
		System.out.println("Introduce otra palabra: ");
		String palabra2=sc.nextLine();
		System.out.println("Introduce una letra: ");
		char letra1=sc.nextLine().charAt(0);
		System.out.println("Introduce otra letra: ");
		char letra2=sc.nextLine().charAt(0);
		System.out.println("a. posiciones de la letra " + letra1 + " En la palabra " + palabra1 + ": ");
		for(int i=0;i<palabra1.length();i++) {
			if(palabra1.charAt(i)==letra1) {
				System.out.print(i + ", ");
			}
		}
		String sustituida= palabra1.replace(letra1, letra2);
		System.out.println("b. " + sustituida);
		System.out.print("c. ");
		for(int i=palabra1.length()-1;i>=0;i--) {
			System.out.print(palabra1.charAt(i));
		}
		System.out.println("d. " + palabra2.toUpperCase());
		palabra1 = palabra1.concat(palabra2);
		System.out.println("e. " + palabra1);
		System.out.print("f. ");
		for(int i=0;i<palabra2.length();i++) {
			if(palabra2.charAt(i)!=letra2) {
				System.out.print(palabra2.charAt(i));
			}
		}
	}

}









