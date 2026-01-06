package jjaavvaa;

import java.util.Scanner;

public class DigitFrequencyCounter {
	public static void main(String args[]) {
		int i,j;
		int max = 0;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		int c[] =new int[n];
		long res[] = new long[100];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
			while(a[i] != 0) {
				c[i]++;
				a[i] = a[i]/10;
			}
			res[c[i]]++;//res[c[i]]]+=1;
			if(c[i]>max) {
				max = c[i];
			}
		}
		
		for(i=1;i<=max;i++) {
			System.out.print(i + " "+res[i]+" ");
		}
		
		
		
		
	}

}
