package actividad16;

import java.util.Scanner;
public class Ejercicio67 {
	public static void main(String[] args) {
		boolean repetido=false;
		int[] lista1= new int[10];
		int[] lista2= new int[10];
		for(int i=0;i<lista1.length;i++) {
			lista1[i]=(int)(Math.random()*50)+1;
			lista2[i]=(int)(Math.random()*50)+1;
		}
		System.out.print("LISTA 1: [");
		for(int i=0;i<lista1.length;i++) {
			System.out.print(lista1[i]);
			if(i!=lista1.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		System.out.print("LISTA 2: [");
		for(int i=0;i<lista2.length;i++) {
			System.out.print(lista2[i]);
			if(i!=lista2.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		for(int i=0;i<lista1.length;i++) {
			for(int j=0;j<lista2.length;j++) {
				if(lista1[i]==lista2[j]) {
					repetido=true;
				}
			}
		}
		if(repetido) {
			System.out.println("Alg�n n�mero est� repetido.");
		}
	}
}