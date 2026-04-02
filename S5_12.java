package jump2.java;
public class S5_12 {
	

	    int a; 

	    void varTest(S5_12 sample) {
	        sample.a++;
	    }

	    public static void main(String[] args) {
	        S5_12 sample = new S5_12();
	        sample.a = 1;
	        sample.varTest(sample);
	        System.out.println(sample.a);
	    }
	}

