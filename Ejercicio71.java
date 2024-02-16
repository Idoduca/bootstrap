package actividad17;

import java.util.Arrays;

public class Ejercicio71 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] array3 = new int[3][3];
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<array3.length;i++) {
			for(int j=0;j<array3[i].length;j++) {
				array3[i][j]=array1[i][j]*array2[i][j];
			}
		}
		for(int i=0;i<array1.length;i++) {
			System.out.println(Arrays.toString(array1[i]));
		}
		System.out.println();
		for(int i=0;i<array2.length;i++) {
			System.out.println(Arrays.toString(array2[i]));
		}
		System.out.println();
		for(int i=0;i<array3.length;i++) {
			System.out.println(Arrays.toString(array3[i]));
		}

	}

}