package actividad19;


import java.util.Scanner;

public class Ejercicio85 {
	static boolean [] taquillas = new boolean[10];
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Qu� quieres hacer?");
			System.out.println("1-. Liberar taquilla.");
			System.out.println("2-. Ocupar taquilla.");
			System.out.println("0-. Salir.");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: liberarTaquilla(); break;
				case 2: ocuparTaquilla(); break;
			}
			
		}while(opcion!=0);

	}
	public static void mostrarTaquillas() {
		for(int i=0;i<taquillas.length;i++) {
			System.out.print(i + ":");
			if(taquillas[i]==true) {
				System.out.println("[ ]");
			}else {
				System.out.println("[X]");
			}
		}
	}
	public static void ocuparTaquilla() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Selecciona la taquilla que quieres ocupar: ");
		mostrarTaquillas();
		int numTaquilla=sc.nextInt();
		taquillas[numTaquilla]=false;
	}
	public static void liberarTaquilla() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Selecciona la taquilla que quieres liberar: ");
		mostrarTaquillas();
		int numTaquilla=sc.nextInt();
		taquillas[numTaquilla]=true;
	}
}