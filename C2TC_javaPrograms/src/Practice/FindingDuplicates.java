package Practice;
import java.util.Scanner;

public class FindingDuplicates {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }

        System.out.print("Duplicates: ");

        for(int i = 0; i<n; i++) {
        	boolean isDuplicate = false;
        	for(int k = 0; k<i; k++) {
        		if(arr[i]==arr[k]) {
        			break;
        		}
             if(!isDuplicate) {
            	 for(int j = 0; j>i; j++) {
            		 if(arr[i]==arr[j]) {
            			 System.out.println(arr[i] +" ");
            			 break;
            		 }
            	 }
             }
        	}
        }
        
    }
}
