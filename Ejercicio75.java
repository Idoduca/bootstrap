package actividad17;

import java.util.Arrays;

public class Ejercicio75 {

	public static void main(String[] args) {
		
		int[][] array = new int[10][10];
		int[] resultados = new int[10];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*2);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				resultados[i]+=array[i][j];
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]) + " tiene " + resultados[i] + " unos.");
		}
	
	}

}