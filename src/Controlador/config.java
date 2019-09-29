package Controlador;

import java.util.Scanner;

public class config {

	public static void print(String valor){
		System.out.println(valor);
	}
	
	public static String input(String valor){
		System.out.print(valor);
		Scanner input = new Scanner(System.in);
		return input.next();
	}
	
	public static int inputInt(String valor){
		return Integer.parseInt(input(valor));
	}
	
	public static double inputDouble(String valor){
		return Double.parseDouble(input(valor));
	}
}
