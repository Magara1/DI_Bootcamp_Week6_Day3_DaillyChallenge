package Multiplication;

import java.util.Iterator;
import java.util.Scanner;

public class Table_de_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number please");
		
		int valueenter =scanner.nextInt();
		
		
		for (int i = 0; i <= valueenter; i++) {
			
			System.out.println("The multiplication Table of " + valueenter + "is ");
			
			for (int j = 0; j <= valueenter; j++) {
				
				System.out.println(j + " * " + i + " = " + i*j);

			}
			
		}
		
		
		
		
		

	}

}
