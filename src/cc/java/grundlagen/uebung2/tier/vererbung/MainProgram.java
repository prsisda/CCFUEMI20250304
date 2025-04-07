package cc.java.grundlagen.uebung2.tier.vererbung;

/**
 * TierDemo Main-Programm
 */
public class MainProgram {

	public static void main(String[] args) {
		
		Hund hund1 = new Hund("Rex", 5, 22.3, "Labrador", true);
		Hund hund2 = new Hund("Bello", 3, 15.0, "Dackel", false);
		
		Katze katze1 = new Katze("Minka", 
				2, 
				3.5, 
				"Grau getigert", 
				2.8, 
				12);
		Katze katze2 = new Katze("Whiskers", 
				4, 
				4.1, 
				"Weiß", 
				3.2, 
				20);
		
		System.out.println("--- Hund 1 ---");
		hund1.schlafen();
		hund1.bewegen();
		hund1.bellen();
		hund1.bringBall();
		System.out.println(hund1);
		
		System.out.println("--- Hund 2 ---");
		hund2.schlafen();
		hund2.bewegen();
		hund2.bellen();
		hund2.bringBall();
		System.out.println(hund2);
		
		System.out.println("--- Katze 1 --- ");
		katze1.schlafen();
		katze1.bewegen();
		katze1.miauen();
		katze1.klettern();
		System.out.println(katze1);

		System.out.println("--- Katze 2 --- ");
		katze2.schlafen();
		katze2.bewegen();
		katze2.miauen();
		katze2.klettern();
		System.out.println(katze2);
	}

}
