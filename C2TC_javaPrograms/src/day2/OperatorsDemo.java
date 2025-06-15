package day2;

public class OperatorsDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		 int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;// 11
		int c = ++a + b + a--;//--a [a used as 12 and then decremented]
		//a=>10
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;//75
		//b=>19,c=>44
System.out.println("d value after the operations: " + d);//75

		System.out.println("a,b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
				
		//Ternary operator demonstration
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);
	}

}
