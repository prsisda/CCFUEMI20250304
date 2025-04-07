package cc.java.grundlagen.uebung2.tier.vererbung;

import java.util.Scanner;

public class MainProgramMitEingabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Einen Hund erstellen");
		
		
		System.out.println("Name: ");
		String tmpHundName = scanner.nextLine();
		System.out.println("Alter: ");
		int tmpAlter = scanner.nextInt();
		
		System.out.println("Hund.name: " + tmpHundName + ", Hund.alter: " + tmpAlter);
		// Hund hund = new Hund();
	}
}
