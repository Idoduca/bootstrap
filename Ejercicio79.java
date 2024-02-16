package actividad18;


import java.util.Scanner;

public class Ejercicio79 {

	public static void main(String[] args) {
		int dni=9143174;
		System.out.println(dni%23);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		System.out.println("Introduce una palabra para buscar: ");
		String palabra=sc.nextLine();
		int contador=0;
		for(int i=0;i<frase.length();i++) {
			boolean iguales=true;
			if(palabra.charAt(0)==frase.charAt(i)) {
				for(int j=0;j<palabra.length();j++) {
					if(i<frase.length() && palabra.charAt(j)==frase.charAt(i)) {
						i++;
					}else {
						iguales=false;
						j=palabra.length();
					}
				}
				if(iguales) {
					contador++;
				}
			}
			
		}
		System.out.println("La palabra se repite " + contador + " veces.");
	}

}