package day10;

public enum Week {

	
	MON("����һ"),TUE("���ڶ�"),WED("������"),THU("������"),FRI("������");
	

	private String desc;
	
	public String getDesc() {
		return desc;
	}

	private Week() {
		
		System.out.println("ʵ����");
	}
	
	private Week(String name) {
		
		System.out.println("��������ʵ����");
		this.desc=name;
	}

	@Override
	public String toString() {
		
		return this.name()+"-"+this.desc;
	}
	
	
	
	
}
