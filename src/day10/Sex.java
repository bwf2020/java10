package day10;

public enum Sex {

	
	MAN("ÄÐ"),WOMAN("Å®");
	
	private String desc;
	
	private Sex(String desc) {
		
		this.desc=desc;
		
	}
	
	public String toString() {
		
		return this.desc;
	}
	
	
}
