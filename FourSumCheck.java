package jjaavvaa;

import java.util.Scanner;

public class FourSumCheck {
	public static void main(String args[]) {
		int i,j,k,l;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int target = obj.nextInt();
		int f = 0;
		for(i = 0;i<n-3;i++) {
			for(j=i+1;j<n-2;j++) {
				for(k=j+1;k<n-1;k++) {
					for(l=k+1;l<n;l++) {
						if(a[i] + a[j] +a[k] + a[l] == target) {
							f=1;
							System.out.print(a[i]+" "+ a[j]+" " +a[k]+" + " +a[l]+"=" +target);
						}
					}
				}
			}
		}
		if(target==0) {
			System.out.println("No Triplets Found");
		}
	}

}
