package actividad17;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio74 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array = new int[50];
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100);
		}
		System.out.println("Array creado: " + Arrays.toString(array));
		System.out.println("En cuantas filas quieres dividirlo?: ");
		int filas=sc.nextInt();
		int columnas=50/filas;
		if(50%filas!=0) {
			columnas++;
		}
		int[][]array2 = new int[filas][columnas];
		int contador=0;
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length ;j++) {
				if(contador<array.length) {
					array2[i][j]=array[contador];
					contador++;
				}
			}
		}
		for(int i=0;i<array2.length;i++) {
			System.out.println(Arrays.toString(array2[i]));
		}
		
	}
}