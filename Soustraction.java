package tn.esprit.alternance;

import java.util.Scanner;

public class Soustraction {
   private static int nOne, nTwo;

   public static void calcule() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Subtraction");
        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();
        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();
        kb.close();
        System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }
}


