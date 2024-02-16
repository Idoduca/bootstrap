package actividad4;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Cu�ntas horas ha trabajado esta semana?");
		int numHoras=sc.nextInt();
		int salario=0;
		if(numHoras<=40) {
			salario=16*numHoras;
		}
		if(numHoras>40) {
			salario=16*40 + 20*(numHoras-40);
		}
		System.out.println("El salario a percibir este mes es: " + salario);
	}

}
