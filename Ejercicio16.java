package actividad6;
import java.util.*;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edad=0, apuesta=0, num1, num2, num3;
		System.out.println("Introduce tu edad: ");
		edad=sc.nextInt();
		if(edad>=18) {
			System.out.println("Introduce la apuesta: (>0 y <50)");
			apuesta=sc.nextInt();
			if(apuesta>0 && apuesta<50) {
				num1=(int)(Math.random()*4)+1;
				num2=(int)(Math.random()*4)+1;
				num3=(int)(Math.random()*4)+1;
				System.out.println("NUMEROS: " + num1 + " - " + num2 + " - "+ num3);
				if(num1==num2 && num1==num3) {
					apuesta*=3;
					System.out.println("Coinciden las 3 ruletas.");
				}else if(num1==num2 || num2==num3 || num1==num3) {
					apuesta*=2;
					System.out.println("Coinciden 2 de las ruletas.");
				}else {
					apuesta=0;
					System.out.println("No coincide ninguna ruleta");
				}
				System.out.println("Se lleva " + apuesta + " euros.");
				
				
				
				
			}else {
				System.out.println("Lo siento, la apuesta no puede ser > de 50");
			}
			
		}else {
			System.out.println("Lo siento, debes ser mayor de 18 a�os para jugar.");
		}

	}

}
