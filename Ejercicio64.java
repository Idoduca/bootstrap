package actividad15;

import java.util.Scanner;
public class Ejercicio64 {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] lista1 = new int[5];
		int[] lista2= new int[5];
		int[] lista3= new int[10];
		for(int i=0;i<lista1.length;i++) {
			System.out.println("Introduce el numero " + (i+1) +" de la lista 1:");
			lista1[i]=sc.nextInt();
		}
		for(int i=0;i<lista2.length;i++) {
			System.out.println("Introduce el numero " + (i+1) +" de la lista 2:");
			lista2[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<lista1.length;i++) {
			lista3[j]=lista1[i];
			j++;
			lista3[j]=lista2[i];
			j++;
		}
		System.out.print("[");
		for(int i=0;i<lista3.length;i++) {
			System.out.print(lista3[i]);
			if(i!=lista3.length-1) {
				System.out.print("|");
			}
		}
		System.out.print("]");
	}
	
}
