package actividad12;


import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num1=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		int num2=sc.nextInt();
		int diferencia=num2-num1;
		boolean par;
		if(diferencia%2==0) {
			par=true;
		}else {
			par=false;
		}
		par=diferencia%2==0;
		int incremento=1;
		if(par) {
			incremento=2;
		}
		for(int i=num2; i>=num1; i-=incremento) {
			System.out.println(i);
		}
	}
}