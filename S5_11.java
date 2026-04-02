package jump2.java;
public class S5_11 {
	int varTest(int a) {
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 1;
		S5_11 sample = new S5_11();
		a = sample.varTest(a);
		System.out.println(a);
	}
}