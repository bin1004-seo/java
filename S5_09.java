package jump2.java;
public class S5_09 {
	void sayNick(String nick) {
		if ("바보".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 " +nick+" 입니다.");
	}
	
	public static void main(String []args) {
		S5_09 sample = new S5_09();
		sample.sayNick("야호");
		sample.sayNick("바보");
	}
}