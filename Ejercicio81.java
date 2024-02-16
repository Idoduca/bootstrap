package actividad19;

import java.util.Arrays;

public class Ejercicio81 {
		
	public static int[] intervalo(int num1, int num2) {
		//calculo el tama�o del array resultante
		int tam = num2-num1+1;
		//Creo el array con el tama�o del paso anterior
		int[] array = new int[tam];
		//recorro con un for el array y en cada posicion voy guardando un numero y sumando 1
		for(int i=0;i<array.length;i++) {
			array[i]=num1;
			num1++;
		}
		//devuelvo el array
		return array;
	}
	public static int[] intervalo(int num1, int num2, int num3) {
		int tam=(num2-num1)/num3;
		if((num2-num1)%num3!=0) {
			tam++;
		}
		int[] array = new int[tam];
		//recorro con un for el array y en cada posicion voy guardando un numero y sumando el intervalo
		for(int i=0;i<array.length;i++) {
			array[i]=num1;
			num1+=num3;
		}
		//devuelvo el array
		return array;	
	}
	public static void main(String[] args) {
		int[] array2=intervalo(10,25,3);

		System.out.println(Arrays.toString(array2));
		
	}

}
