package day10;

public enum Week {

	
	MON("星期一"),TUE("星期二"),WED("星期三"),THU("星期四"),FRI("星期五");
	

	private String desc;
	
	public String getDesc() {
		return desc;
	}

	private Week() {
		
		System.out.println("实例化");
	}
	
	private Week(String name) {
		
		System.out.println("带参数的实例化");
		this.desc=name;
	}

	@Override
	public String toString() {
		
		return this.name()+"-"+this.desc;
	}
	
	
	
	
}
