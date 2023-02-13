package tn.esprit.alternance;

import java.util.Scanner;

public class Multiplication {
//
	//git
	public static void multiplication()
	{int nOne, nTwo;
	Scanner kb = new Scanner(System.in);
	System.out.println("Multiplication");
	System.out.print("\nFirst Number: ");nOne = kb.nextInt();
	System.out.print("\nSecond Number: ");nTwo = kb.nextInt();
	kb.close();System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));}
}
