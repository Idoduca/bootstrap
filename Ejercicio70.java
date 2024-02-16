package actividad17;

import java.util.Arrays;

public class Ejercicio70 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=i*j;
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}