package cc.java.grundlagen.uebung2.tier.vererbung;

public class Tier {

	protected String name;
	
	protected int alter;
	
	protected double gewicht;

	public Tier(String name, int alter, double gewicht) {
		this.name = name;
		this.alter = alter;
		this.gewicht = gewicht;
	}
	
	public Tier() {
	}

	public void schlafen() {
		System.out.println(name + " schläft.");
	}
	
	public void bewegen() {
		System.out.println(name + " bewegt sich.");
	}

	@Override
	public String toString() {
		return "Tier [name=" + name + ", alter=" + alter + ", gewicht=" + gewicht + "]";
	}
}
