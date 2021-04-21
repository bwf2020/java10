package day14;

import java.io.Serializable;

public class User implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6765482401676826155L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/*@Override
	public String toString() {
		
		return "id:"+this.id+","+"name:"+this.name+","+"sex:"+this.sex;
	}*/
	private int id;
	private String name;
	private char sex;
	
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
}
