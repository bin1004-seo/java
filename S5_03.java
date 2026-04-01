package jump2.java;

class Calculator3 {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}




public class S5_03 {
    public static void main(String[] args) {
    	Calculator3 cal1 = new Calculator3();
    	Calculator3 cal2 = new Calculator3();
    	
    	
    	
    	
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}