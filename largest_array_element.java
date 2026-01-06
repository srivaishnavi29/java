//         using sort method and without sort method

package jjaavvaa;
import java.util.*;
public class largest_array_element {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = obj.nextInt();
		}
		
	/*	
	 * Using Sort method 
	 * 
	   Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[n-1]); */
		
		// without using sort method
		           //int c = 1;
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
			                /*else if (a[i] == max) {
			                    	c++;
			                }*/
		}
		
		System.out.println("Largest element in the array is:"+max);
	}
}
