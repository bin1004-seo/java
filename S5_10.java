package jump2.java;
public class S5_10 {
	void varTest(int a) {
		a++;
	}
	
	public static void main(String[] args) {
		int a = 1;
		S5_10 sample = new S5_10();
		sample.varTest(a);
		System.out.println(a);
	}
}