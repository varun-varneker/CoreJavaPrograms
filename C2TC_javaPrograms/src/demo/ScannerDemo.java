package demo;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String Name = sh.next();
		System.out.println("Your name is: "+Name);
		
	}

}
