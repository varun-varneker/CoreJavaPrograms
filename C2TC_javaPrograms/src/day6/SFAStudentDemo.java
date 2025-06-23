package day6;

public class SFAStudentDemo {
	public static void main(String[] args) {
		
		SFAStudent s = new SFAStudent(100);
		System.out.println(s);
		
		SFAStudent s1 = new SFAStudent(200);
		System.out.println(s1);
		
		SFAStudent s2 = new SFAStudent(300);
		System.out.println(s2);
	}
	static {
		System.out.println("Hello Static gets printed first");
	}
	public static void main(char c) {
		System.out.println("Hello from character main method...");
	}
	public static void main() {
		System.out.println("Hello form no args main method...");
	}

}
