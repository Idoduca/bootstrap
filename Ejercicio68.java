package actividad16;

import java.util.Scanner;
public class Ejercicio68 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Cu�ntos alumnos se evaluan?");
		int num= sc.nextInt();
		int[] asig1= new int[num];
		int[] asig2= new int[num];
		int[] asig3= new int[num];
		for(int i=0; i<num;i++) {
			System.out.println("Nota del alumno " + i + ", asignatura 1: ");
			asig1[i]=sc.nextInt();
			System.out.println("Nota del alumno " + i + ", asignatura 2: ");
			asig2[i]=sc.nextInt();
			System.out.println("Nota del alumno " + i + ", asignatura 3: ");
			asig3[i]=sc.nextInt();
		}
		int[] suspensos = new int[3];
		double[] media= new double[3];
		for(int i=0;i<num;i++) {
			if(asig1[i]<5) {
				suspensos[0]++;
			}
			if(asig2[i]<5) {
				suspensos[1]++;
			}
			if(asig3[i]<5) {
				suspensos[2]++;
			}
			media[0]+=asig1[i];
			media[1]+=asig2[i];
			media[2]+=asig3[i];
		}
		media[0]/=num;
		media[1]/=num;
		media[2]/=num;
		
		int [] suspAlumnos = new int[num];
		double [] mediaAlumnos = new double[num];
		
		for(int i=0;i<num;i++) {
			if(asig1[i]<5) {
				suspAlumnos[i]++;
			}
			if(asig2[i]<5) {
				suspAlumnos[i]++;
			}
			if(asig3[i]<5) {
				suspAlumnos[i]++;
			}
			mediaAlumnos[i]=(asig1[i]+asig2[i]+asig3[i])/3;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("Suspensos alumno " + i + ": " + suspAlumnos[i]);
			System.out.println("Media alumno " + i + ": " + mediaAlumnos[i]);
		}
			
		System.out.println("Suspensos asig 1: " + suspensos[0]);
		System.out.println("Suspensos asig 2: " + suspensos[1]);
		System.out.println("Suspensos asig 3: " + suspensos[2]);
		
		System.out.println("Media asig 1: " + media[0]);
		System.out.println("Media asig 2: " + media[1]);
		System.out.println("Media asig 3: " + media[2]);

	}
	
}












