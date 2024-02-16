package actividad19;

public class Ejercicio83 {
	
	public static double porcentaje(String texto) {
		String palabra;
		int indice = 0, words = 0, cont = 0;
		for (int i=0; i<texto.length(); i++) {
			if(texto.charAt(i)==' ') {
				words++;
				palabra=texto.substring(indice,i);
				indice = i+1;
				System.out.println(palabra);
				if (palabra.length()<5) {
					cont++;
				}
			}
		}
		palabra=texto.substring(indice,texto.length());
		System.out.println(palabra);
		if (palabra.length()<5) {
			cont++;
		}
		System.out.println(words+1);
		System.out.println(cont);
		System.out.println((double)(cont/(words+1))*100);
		
		return ((cont/(words+1))*100);
	}
	
	
	public static void main(String[] args) {
		porcentaje ("el mundo es genial");
		
	}

}
