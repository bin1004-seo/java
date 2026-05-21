package jump2java;
import java.util.Scanner;

class Student{
	String name;
	int studentNumber;
	double score;
	
	Student(String name, int sN){
		this.name = name;
		this.studentNumber = sN;
	}
	void setScire(double score) {
		this.score = score;
		System.out.println(this.score);
	}
	
	double setscore2(double score) {
		this.score = score;
		return this.score;
	}
	
}

public class T0521A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
		System.out.println("학번:");
		int sN = sc.nextInt();
		System.out.println("점수:");
		double score = sc.nextDouble();
		sc.close();
		
		Student s1 = new Student(name, sN);
		Student s2 = new Student("대중", 0000000);
		
		s1.setScire(score);
		System.out.println("점수는 "+s1.setscore2(score)+"점");
	}
}
