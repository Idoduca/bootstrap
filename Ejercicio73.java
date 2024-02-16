package actividad17;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array= new int[10];
		for(int i =0;i<array.length;i++) {
			System.out.println("Introduce el numero para la posicion " + i + ":");
			int numero=sc.nextInt();
			boolean repetido=false;
			//Compruebo si el numero se repite con un for
			for(int j=0;j<i;j++) {
				if(array[j]==numero) {
					repetido=true;
				}
			}
			if(repetido) {
				System.out.println("Numero repetido.");
				i--;
			}else {
				array[i]=numero;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}