package cc.java.grundlagen.uebung2.tier.vererbung;

public class Hund extends Tier {

	private String rasse;
	
	private boolean brauchtLeine;
	
	public Hund() {
		super();
	}
	
	public Hund(String name, 
			int alter, 
			double gewicht, 
			String rasse, 
			boolean brauchtLeine) {
		super(name, alter, gewicht);
		this.rasse = rasse;
		this.brauchtLeine = brauchtLeine;
	}
	
	public void bellen() {
		System.out.println(name + " bellt: Wuff!");
	}
	
	public void bringBall() {
		System.out.println(name + " bringt den Ball zurück.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Hund [rasse=" + rasse + ", brauchtLeine=" + brauchtLeine + "]";
	}
	
	
}
