package day12;

public class User {

	
	public int a;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.a==((User)obj).a;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(a);
	}


	
	
}
