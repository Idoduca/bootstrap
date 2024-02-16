package actividad19;

public class Ejercicio80 {

	public static void maximo(int num1, int num2) {
		int max;
		if(num1>num2) {
			max = num1;
		}else {
			max = num2;
		}
		System.out.println("El m�ximo es " + max);
	}
	public static void maximo(int num1, int num2, int num3) {
		int max;
		if(num1>num2 && num2>num3) {
			max = num1;
		}else if(num2>num1 && num2>num3) {
			max = num2;
		}else {
			max=num3;
		}
		System.out.println("El m�ximo es " + max);
	}
	public static void maximo(int[] array) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("El maximo es " + max);
	}
	public static void main(String[] args) {
		maximo(2,10);
		maximo(3,20,6);
		int[]array= {3,5,76,43,25,67};
		maximo(array);

	}

}