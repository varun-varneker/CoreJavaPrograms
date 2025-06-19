package day3.Constructor;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setID(69);
		s.setName("Varun");
		s.setAge(21);
		System.out.println(s);
		
		Student s1 = new Student();
		s1.setID(99);
		s1.setName("Deepan");
		s1.setAge(21);
		System.out.println(s1);
	}
	
}
