package actividad9;

import java.util.Scanner;
public class Ejercicio34 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean salir=false;
		int numPartido=1, golesLocal, golesVisitante, partidoMasGoles=0, golesMaximo=0,
				partidoMenosGoles=0, golesMinimo=500, partidoEmpate=0, partido10Goles=0,
				partidosLocales=0, partidosVisitantes=0, golesTotales=0;
		do {
			System.out.println("DATOS DEL PARTIDO " + numPartido);
			System.out.println("Introduce los goles del equipo local: ");
			golesLocal=sc.nextInt();
			if(golesLocal==-1) {
				salir=true;
			}else {
				System.out.println("Introduce los goles del equipo visitante: ");
				golesVisitante=sc.nextInt();
				//AQU� HAGO LOS CALCULOS
				if(golesMaximo<(golesLocal+golesVisitante)) {
					golesMaximo=golesLocal+golesVisitante;
					partidoMasGoles=numPartido;
				}
				if(golesMinimo>(golesLocal+golesVisitante)) {
					golesMinimo=golesLocal+golesVisitante;
					partidoMenosGoles=numPartido;
				}
				if(golesLocal==golesVisitante) {
					partidoEmpate=numPartido;
				}
				if(golesLocal+golesVisitante>10) {
					partido10Goles=numPartido;
				}
				if(golesLocal>golesVisitante) {
					partidosLocales++;
				}
				if(golesLocal<golesVisitante) {
					partidosVisitantes++;
				}
				golesTotales+=golesLocal+golesVisitante;
				numPartido++;
			}
		}while (!salir);
		//AQUI MUESTRO LOS RESULTADOS
		System.out.println("Partido con mas goles: " + partidoMasGoles);
		System.out.println("Partido con menos goles: " + partidoMenosGoles);
		System.out.println("Partido con empate: " + partidoEmpate);
		System.out.println("Partido con mas de 10 goles: " + partido10Goles);
		System.out.println("Partidos ganado por locales: " + partidosLocales);
		System.out.println("Partidos ganado por visitantes: " + partidosVisitantes);
		System.out.println("Media de goles: " + (double)(golesTotales/(numPartido-1)));
			
	}
}

