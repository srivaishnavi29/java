package jjaavvaa;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
	public static void main(String args[]) {
		int i;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int res[] = new int[n];
		int ind = obj.nextInt();
		int p = a[ind];
		int left = 0 ;
		int right = n-1;
		for(i=0;i<n;i++) {
			if(ind == i) {
				continue;
			}
			if(a[i] <p) {
					res[left++] = a[i];
				}
				else {
					res[right--] = a[i];
				}
			}
		
		
		res[left] = p;
		
		System.out.println(Arrays.toString(res));
		
		for(i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
