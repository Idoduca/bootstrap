package actividad19;

import java.util.Scanner;

public class Ejercicio82 {

	public static void main(String[] args) {
		Scanner sc1= new Scanner (System.in);
		Scanner sc2= new Scanner (System.in);
		System.out.println("�Que opcion quieres? 'v' para volumen, 'a' para area: ");
		char opcion=sc1.nextLine().charAt(0);
		System.out.println("Introduce el radio.");
		double radio=sc2.nextDouble();
		System.out.println("Introduce la altura.");
		double altura=sc2.nextDouble();
		calcularCilindro(opcion, radio, altura);

	}
	public static void calcularCilindro(char opcion, double radio, double altura) {
		double calculo =0;
		if(opcion=='v') {
			calculo=Math.PI*radio*altura;
			System.out.println("El area es: " + calculo);
		}else {
			calculo=2*Math.PI*altura*(altura+radio);
			System.out.println("El volumen es: " + calculo);
		}
		
	}

}
