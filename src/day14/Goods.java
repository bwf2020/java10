package day14;

public class Goods implements Comparable{

	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		

		return id.compareTo(((Goods)o).getId());
		
		//return ((Goods)o).getId().compareTo(this.id);
		
		
	}
	
	
}
