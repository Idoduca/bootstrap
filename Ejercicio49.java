package actividad12;


import java.util.Scanner;
public class Ejercicio49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		do {
			int auxiliar=numero;
			int acumulador=0;
			while(auxiliar>0) {
				int cifra=auxiliar%10;
				auxiliar=auxiliar/10;
				acumulador+=cifra;
			}
			numero=acumulador;
			System.out.println(numero);
		}while(numero>9);
	}

}
