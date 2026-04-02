package jump2.java;
public class S5_13 {
	

	    int a; 

	    void varTest() {
	        this.a++;
	    }

	    public static void main(String[] args) {
	        S5_13 sample = new S5_13();
	        sample.a = 1;
	        sample.varTest();
	        System.out.println(sample.a);
	    }
	}

