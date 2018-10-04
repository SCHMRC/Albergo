package array;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] array = new int[30]; //dichiarazione array
		int media,somma=0;
		Scanner tastiera = new Scanner(System.in);
		System.out.print("Inserisci i giorni:");
		int x=tastiera.nextInt();
		
		
		for (int i=0 ; i<x ; i++) {
			System.out.print("Inserisci il valore numero " + (i+1) + ":");
			int numero = tastiera.nextInt();
			array[i] = numero;
			somma+=numero;
		}
		media = somma/x;
		System.out.println("la media è: " +media);
		
		for (int i=0 ; i<x ; i++) {
		  if (array[i]<media)
			  System.out.println("il giorno " +(i+1)+ " è stato inferiore alla media");
		}
		
		for (int i=0 ; i<(x-1) ; i++) {
			  if (array[i]<media && array[i+1]<media)
				  System.out.println("il giorno " +(i+1)+ " e " +(i+2)+ " sono stati inferiori alla media");
			}
		
	}

}
