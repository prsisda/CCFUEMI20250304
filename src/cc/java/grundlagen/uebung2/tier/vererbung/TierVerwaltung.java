package cc.java.grundlagen.uebung2.tier.vererbung;

import java.util.ArrayList;
import java.util.Scanner;

public class TierVerwaltung {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Tier> tierListe = new ArrayList<>();
		
		int auswahl = 0;
		
		do {
			System.out.println("--- Tier-Menü ---");
			System.out.println("1. Hund erstellen");
			System.out.println("2. Katze erstellen");
			System.out.println("3. Alle Tiere anzeigen");
			System.out.println("0. Beenden");
			
			auswahl = scanner.nextInt();
			scanner.nextLine(); // Puffer löschen
			
			switch (auswahl) {
			case 1:
				System.out.println("Name des Hundes:");
				String hName = scanner.nextLine();
				System.out.println("Alter des Hundes:");
				int hAlter = scanner.nextInt();
				System.out.println("Gewicht des Hundes:");
				double hGewicht = scanner.nextDouble();
				scanner.nextLine(); // Buffer leeren
				System.out.println("Rasse des Hundes:");
				String hRasse = scanner.nextLine();
				System.out.println("Braucht Leine (true/false):");
				boolean leine = scanner.nextBoolean();
				
				Hund hund = new Hund(hName, hAlter, hGewicht, hRasse, leine);
				tierListe.add(hund);
				
				System.out.println(hund);
				System.out.println("Hund erstellt.");
				break;

			case 2:
				System.out.println("Katze erstellen");
				break;
			
			case 3:
				System.out.println("Alle Tiere werden angezeigt");
				
				if(tierListe.isEmpty()) {
					System.out.println("Keine Tiere vorhanden.");
				} else {
					for (Tier tier : tierListe) {
						System.out.println(tier);
					}
				}
				break;
				
			case 0:
				System.out.println("Programm beendet.");
				break;
				
			default:
				System.out.println("Ungültige Eingabe.");
				break;
			}
			
		} while(auswahl != 0);
		
		scanner.close();
	}	
}
