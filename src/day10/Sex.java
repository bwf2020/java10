package day10;

public enum Sex {

	
	MAN("��"),WOMAN("Ů");
	
	private String desc;
	
	private Sex(String desc) {
		
		this.desc=desc;
		
	}
	
	public String toString() {
		
		return this.desc;
	}
	
	
}
