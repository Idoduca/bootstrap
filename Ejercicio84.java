package actividad19;

import java.util.Scanner;

public class Ejercicio84 {
	
	public static String conversorFecha(String date) {
		String meses[]={ "Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		String[] datosFecha = new String[3];
		int inicio=0, cont=0;
		for(int i=0;i<date.length();i++) {
			if(date.charAt(i)=='/') {
				datosFecha[cont]=date.substring(inicio, i);
				cont++;
				inicio=i+1;
			}
		}
		datosFecha[cont]=date.substring(inicio,date.length());
		if (date.length()<5) {
			cont++;
		}
		String dia = datosFecha[0];
		String mes1 = datosFecha[1];
		int mes = Integer.parseInt(mes1);
		String anio = datosFecha[2];
		String conversion = dia +" de " +meses[mes-1] +" de " +anio;
		return conversion;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir una fecha (formato dd/mm/aaaa): ");
		String fecha = sc.nextLine();
		String newFecha = conversorFecha(fecha);
		System.out.println(newFecha);
	}	
	
}
