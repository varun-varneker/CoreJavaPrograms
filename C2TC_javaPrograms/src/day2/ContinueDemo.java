package day2;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int k = 1; k < 15; k++)
		{
		// even numbers are skipped
		if (k%2 == 0)
		continue;
		// odd numbers are printed
		System.out.print(k + " ");
		}
	}

}
