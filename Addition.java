package tn.esprit.alternance;
import java.util.Scanner;
public class Addition {
	
	
	public static void addition(){
		int nOne, nTwo;
		Scanner kb = new Scanner(System.in);
		System.out.println("Addition");
		System.out.print("\nFirst Number: ");nOne = kb.nextInt();
		System.out.print("\nSecond Number: ");nTwo = kb.nextInt();
		kb.close();
	System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));}

}
