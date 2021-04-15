package day10;

public class Dog implements IAnimal{

	
	private int id;
	private String name;
	private String sex;
	
	private boolean flag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void jiaosheng() {

		
		System.out.println("ÍôÍô..........");

		
	}
	
	
	
	

}
