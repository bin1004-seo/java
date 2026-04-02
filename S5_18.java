package jump2.java;
	class Animal4 {
		String name;
		
		void setName(String name) {
			this.name = name;
		}
	   }
	

	class Dog4 extends Animal4 {
		void sleep() {
			System.out.println(this.name+" zzz");
		}
	}
	
	class HouseDog2 extends Dog4 {
		void sleep() {
			System.out.println(this.name + " zzz in house");
		}
		
		void sleep(int hour) {
			System.out.println(this.name + " zzz in house for" + hour + " hours");
		}
	}

	public class S5_18 {
	    public static void main(String[] args) {
	       HouseDog2 houseDog = new HouseDog2 ();
	       houseDog.setName("happy");
	       houseDog.sleep();
	       houseDog.sleep(3);
	    }
	}


