package actividad5;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el d�a de la semana en formato num�rico: ");
		int diaSem=sc.nextInt();
		System.out.println("Introduce el d�a del mes: ");
		int diaMes=sc.nextInt();
		System.out.println("Introduce el mes en formato num�rico: ");
		int mes= sc.nextInt();
		System.out.println("Introduce el a�o: ");
		int anio=sc.nextInt();
		System.out.print("Es ");
		switch(diaSem) {
		case 1: 				
			System.out.print("lunes, ");
			break;
		case 2: System.out.print("martes, ");
			break;
		case 3: System.out.print("miercoles, ");
			break;
		case 4: System.out.print("jueves, ");
			break;
		case 5: System.out.print("viernes, ");
			break;
		case 6: System.out.print("sabado, ");
			break;
		case 7: System.out.print("domingo, ");
			break;
		}
		System.out.print(diaMes + " de ");
		switch(mes) {
			case 1: System.out.print("enero ");
			break;
			case 2: System.out.print("febrero ");
			break;
			case 3: System.out.print("marzo ");
			break;
			case 4: System.out.print("abril ");
			break;
			case 5: System.out.print("mayo ");
			break;
			case 6: System.out.print("junio ");
			break;
			case 7: System.out.print("julio ");
			break;
			case 8: System.out.print("agosto ");
			break;
			case 9: System.out.print("septiembre ");
			break;
			case 10: System.out.print("octubre ");
			break;
			case 11: System.out.print("noviembre ");
			break;
			case 12: System.out.print("diciembre ");
			break;
		}
		System.out.print("de " + anio);
	}

}

