package actividad5;

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el mes: ");
		int mes=sc.nextInt();
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("El mes introducido tiene 31 d�as");
				break;
			case 4:  case 6: case 9: case 11:
				System.out.println("El mes tiene 30 d�as.");
				break;
			case 2:
				System.out.println("El mes tiene 28 d�as.");
				break;
			default:
				System.out.println("El mes introducido no es correcto");
		}

	}

}
