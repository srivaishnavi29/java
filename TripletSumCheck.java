package jjaavvaa;

import java.util.Scanner;

public class TripletSumCheck {
	public static void main(String args[]) {
		int i,j,k;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int target = obj.nextInt();
		int f = 0;
		for(i = 0;i<n-2;i++) {
			for(j=i+1;j<n-1;j++) {
				for(k=j+1;k<n;k++) {
					if(a[i] + a[j] +a[k] == target) {
						f=1;
						System.out.print(a[i]+" "+ a[j]+" " +a[k] +"=" +target);
					}
				}
			}
		}
		if(f==0) {
			System.out.println("No Triplets Found");
		}
	}

}
