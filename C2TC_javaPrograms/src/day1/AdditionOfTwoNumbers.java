package day1;
import java.util.Scanner;
public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		Scanner Sc;
		int a,b,c;
		
		Sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		a = Sc.nextInt();
		System.out.println("Enter value b: ");
		b = Sc.nextInt();
		c = a+b;
		
		System.out.print("Addition of "+a+ " and "+b+" is: ");	
		System.out.println(c);
        
		
	}

}
