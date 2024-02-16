package actividad11;


import java.util.Scanner;
public class Ejercicio43{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=2;
	int contador=0;
	int acumulador=1;
	while(contador<5) {
		boolean primo=true;
		int i=2;
		while(i<num) {
			if(num%i==0) {
				primo=false;
			}
			i++;
		}
		if(primo==true) {
			acumulador*=num;
			contador++;
		}
		num++;
	}
	System.out.println("El acumulador vale: " + acumulador);
}

}