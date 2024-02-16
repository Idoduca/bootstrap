package actividad4;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c,aux;
		System.out.println("Introduce un numero: ");
		a= sc.nextInt();
		System.out.println("Introduce otro numero: ");
		b= sc.nextInt();
		System.out.println("Introduce otro numero: ");
		c= sc.nextInt();
		//En caso de no estar en orden intercambiamos los valores utilizando aux.
		if(a<b) {
			aux=a; a=b; b=aux;
		}
		if(b<c) {
			aux=b; b=c; c=aux;
		}
		if(a<b) {
			aux=a;a=b; b=aux;
		}
		System.out.println("Los numeros ordenados son: " + a + ", " + b + ", " + c);
				

	}

}
