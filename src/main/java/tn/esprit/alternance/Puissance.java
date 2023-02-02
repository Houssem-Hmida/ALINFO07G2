package tn.esprit.alternance;
import java.util.Scanner;
public class Puissance {

	
	public static void puissance(){int nOne, nTwo;
	Scanner kb = new Scanner(System.in);
	System.out.println("Puissance");
	System.out.print("\nFirst Number: ");nOne = kb.nextInt();
	System.out.print("\nSecond Number: ");nTwo = kb.nextInt();
	kb.close();System.out.println("\nPuissance: " + nOne + " ** " + nTwo + " = " + (Math.pow(nOne, nTwo)));}
}
