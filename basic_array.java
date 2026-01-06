package jjaavvaa;
import java.util.*;
public class basic_array {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		
		for(int i = 0 ; i<n ; i++) { 
			a[i] = obj.nextInt();
		}
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n"+Arrays.toString(a));

	}
}
