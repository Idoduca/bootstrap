package actividad14;

import java.util.Scanner;
public class Ejercicio58 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra=sc.nextLine();
		for(int i=0;i<palabra.length();i++) {
			System.out.print(palabra.charAt(i));
		}
		for(int i=palabra.length()-1;i>=0;i--) {
			System.out.print(palabra.charAt(i));
		}
		
		
	}

}
