package repaso;

import java.util.Scanner;

public class PruebaRepaso {

	public static void main(String[] args) {
		int num1=0, num2=0;
		Scanner ent =new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num1=Integer.parseInt(ent.nextLine());
		System.out.println("Introduce un numero:");
		num2=Integer.parseInt(ent.nextLine());
		
		sumar(num1,num2); //Laro has este método.
		restar(num1,num2); 
		

	}
	
	public static void sumar(int num1,int num2) {
		
		System.out.println(num1+num2);

	}
	
	public static void restar(int num1,int num2) {

		System.out.println(num1-num2);

	}
	}
	
	
