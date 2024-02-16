package actividad15;

import java.util.Scanner;
public class Ejercicio63 {


	public static void main(String[] args) {
		try (Scanner table = new Scanner(System.in)) {
			int tamanio= 10, maximo=Integer.MIN_VALUE, minimo=Integer.MAX_VALUE;
			int[] lista = new int[tamanio];
			double media=0;
			for(int i=0;i<tamanio;i++) {
				System.out.println("Introduce el numero " + (i+1) +":");
				lista[i]=table.nextInt();
			}
			for(int i=0;i<tamanio;i++) {
				media+=lista[i];
				if(lista[i]>maximo) {
					maximo=lista[i];
				}
				if(lista[i]<minimo) {
					minimo=lista[i];
				}
			}
			System.out.println("El maximo es " + maximo);
			System.out.println("El minimo es " + minimo);
			System.out.println("La media es " + media/tamanio);
		}
	
	}
}