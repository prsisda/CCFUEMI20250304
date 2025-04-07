package cc.java.grundlagen;

public class ProzeduralProgram {

	public static void main(String[] args) {
		int zahl1 = 5;
		int zahl2 = 10;
		
		int summe = addiere(zahl1, zahl2);
		System.out.println("Die Summe ist: " + summe);
	}

	public static int addiere(int a, int b) {
		return a + b;
	}
	
}
