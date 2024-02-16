package actividad4;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.println("Introduce el valor numerico de la nota: ");
		nota=sc.nextInt();
		if(nota>=0 && nota<5) {
			System.out.println("Insuficiente.");
		}
		if(nota==5) {
			System.out.println("Suficiente.");
		}
		if(nota==6) {
			System.out.println("Bien.");
		}
		if(nota==7 || nota==8) {
			System.out.println("Notable.");
		}
		if(nota==9 || nota==10) {
			System.out.println("Sobresaliente.");
		}
		if(nota<0 || nota>10) {
			System.out.println("Error.");
		}
	}

}

