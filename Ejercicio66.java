package actividad16;

import java.util.Scanner;
public class Ejercicio66 {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean repetido=false;
		int[] lista= new int[10];
		for(int i=0;i<lista.length;i++) {
			System.out.println("Introduce el numero " + (i+1) +" de la lista 1:");
			lista[i]=sc.nextInt();
		}
		for(int i=0;i<lista.length;i++) {
			for(int j=i+1;j<lista.length;j++) {
				if(lista[i]==lista[j]) {
					repetido=true;
				}
			}
		}
		if(repetido) {
			System.out.println("Alg�n n�mero est� repetido.");
		}
		
	}
	
}