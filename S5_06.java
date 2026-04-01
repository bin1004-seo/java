package jump2.java;

class Animal3 {
	String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
}

public class S5_06 {
	public static void main(String[] args) {
		Animal3 cat = new Animal3();
		cat.setName("boby");
		
		Animal3 dog = new Animal3();
		dog.setName("happy");
		
		
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		}
	}
