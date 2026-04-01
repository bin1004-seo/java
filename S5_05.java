package jump2.java;

class Animal2 {
	String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
}

public class S5_05 {
	public static void main(String[] args) {
		Animal2 cat = new Animal2();
		cat.setName("boby");
		System.out.println(cat.name);
		
		}
	}
