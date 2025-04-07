package cc.java.grundlagen.uebung1.tier;

public class Tier {

	private String name;
	
	private	String farbe;
	
	private int alter;		
	
	public Tier() {
		this.name = "blub";
	}	

	public Tier(String name) {
		this.name = name;
	}

	public Tier(String name, String farbe, int alter) {
		this.name = name;
		this.farbe = farbe;
		this.alter = alter;
	}

	public int getAlter() {
		return alter;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tier [name=" + name + ", farbe=" + farbe + ", alter=" + alter + "]";
	}
	
	
}
