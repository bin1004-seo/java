package jump2.java;
	class Animal1 {
		String name;
		
		void setName(String name) {
			this.name = name;
		}
	   }
	

	class Dog1 extends Animal1 {
		void sleep() {
			System.out.println(this.name+" zzz");
		}
	}

	public class S5_16 {
	    public static void main(String[] args) {
	       Dog1 dog = new Dog1();
	       dog.setName("poppy");
	       System.out.println(dog.name);
	       dog.sleep();
	    }
	}


