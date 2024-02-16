package actividad16;


import java.util.Scanner;

public class Ejercicio69 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0;i<8;i++) {
			array[i]=(int)(Math.random()*10);
		}
		System.out.print("LISTA 1: [");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i!=array.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		
		
		
		for(int i=0;i<2;i++) {
			System.out.println("Introduce un numero: ");
			int numero=sc.nextInt();
			System.out.println("Introduce la posicion en la que lo quieres insertar: ");
			int posicion=sc.nextInt();
			for(int j=array.length-1;j>posicion;j--) {
				array[j]=array[j-1];			
			}
			array[posicion]=numero;
		}
		
		
		
		
		System.out.print("LISTA 1: [");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i!=array.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		

	}

}
