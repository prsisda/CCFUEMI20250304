package cc.java.grundlagen.uebung2.tier.vererbung;

public class Katze extends Tier {

	private String fellFarbe;
	
	private double kletterHoeheMax;
	
	private int anzahlMaeuseGefangen;
	
	public Katze(String name, 
			int alter, 
			double gewicht,
			String fellFarbe,
			double kletterHoeheMax,
			int anzahlMaeuseGefangen) {
		super(name, alter, gewicht);
		this.fellFarbe = fellFarbe;
		this.kletterHoeheMax = kletterHoeheMax;
		this.anzahlMaeuseGefangen = anzahlMaeuseGefangen;
	}

	public void miauen() {
		System.out.println(name + " miaut: Miau!");
	}
	
	public void klettern() {
		System.out.println(name + " klettert auf einem Baum.");
	}

	@Override
	public String toString() {
		return "Katze [fellFarbe=" + fellFarbe + ", kletterHoeheMax=" + kletterHoeheMax + ", anzahlMaeuseGefangen="
				+ anzahlMaeuseGefangen + ", name=" + name + ", alter=" + alter + ", gewicht=" + gewicht + "]";
	}
	
	
}
