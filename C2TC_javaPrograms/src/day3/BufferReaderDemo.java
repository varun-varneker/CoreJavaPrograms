package day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	public static void main(String[] args)throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name = reader.readLine();
		
		System.out.println("Enter your age: ");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter your salary: ");
		double salary = Double.parseDouble(reader.readLine());
	}

}
