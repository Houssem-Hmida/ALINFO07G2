package tn.esprit.alternance;

import java.util.Scanner;


public class Division {

	int nOne, nTwo;
	Scanner kb = new Scanner(System.in);
	
	public void div() {System.out.println("Division");
	System.out.print("\nFirst Number: ");
	nOne = kb.nextInt(); 
	System.out.print("\nSecond Number: "); 
	nTwo = kb.nextInt();
	//kb.close(); 
	System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));}
	@Override
	public String toString() {
		return "Division [nOne=" + nOne + ", nTwo=" + nTwo + ", kb=" + kb + "]";
	}

}

