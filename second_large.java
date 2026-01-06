package jjaavvaa;
import java.util.*;

public class second_large {
	public static void main(String[] args) {
		int c = 1;
		
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = obj.nextInt();
		}
		
	/*	// Arrays.sort(a);
		//	System.out.println(Arrays.toString(a));
		//	System.out.println(a[n-2]); 
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
			else if(a[i] == max) {
				c++;
			}
		}
		
		if (c == n) {
			System.out.println("No second max");
		}
			
	*/
		
		
		int smax = 0, f=0;
		Arrays.sort(a);
		for(int i = n-2; i>=0 ; i--) {
			if (a[i] != a[n-1]) {
				smax = a[i];
				f=1;
				break;
			}		
	}
		if (f == 1) {
			System.out.println(smax);
		}
		else {
			System.out.println("No second max");
		}
}
}
