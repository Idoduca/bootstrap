package actividad10;

public class Ejercicio35 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println("***TABLA DE MULTIPLICAR DEL " + i + "***");
			int j=1;
			while(j<10) {
				System.out.println(i + " X "+ j + " = " + i*j);
				j++;
			}
			i++;
		}
		for(int x=1; x<=10;x++) {
			System.out.println("***TABLA DE MULTIPLICAR DEL " + x + "***");
			for(int y=1;y<=10;y++) {
				System.out.println(x + " X "+ y + " = " + x*y);
			}
			
		}
		
		

	}

}
