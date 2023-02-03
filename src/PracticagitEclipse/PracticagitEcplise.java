package PracticagitEclipse;

import java.util.Scanner;

public class PracticagitEcplise {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		      System.out.println("dime un numero : ");
		      int a = sc.nextInt();
		    
		      System.out.println("dime un numero entero: ");
		      int b = sc.nextInt();
		      
		      boolean resultado = (a != b);
		      
		      System.out.println("El resultado es: " + resultado);
		      sc.close();
			}
}

