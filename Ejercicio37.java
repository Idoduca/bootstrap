package actividad10;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de filas: ");
		int filas=sc.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		int columnas=sc.nextInt();
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
