package tn.esprit.alternance;

import java.util.Scanner;

public class ClassH {
	public static void racine() {
		int nOne;
		double tmp;
		Scanner kb = new Scanner(System.in);
		System.out.println("Racine");
		System.out.print("\nNumber: ");
		nOne = kb.nextInt();
		double d = nOne / 2;
		do {
			tmp = d;
			d = (tmp + (nOne / tmp)) / 2;
		} while ((tmp - d) != 0);
		kb.close();
		System.out.println("\nRacine: " + d);
	}

}
