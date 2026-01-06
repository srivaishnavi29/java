package jjaavvaa;

import java.util.Scanner;

public class No_ofSubArrays {
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
		for(i=0;i<n;i++) {
			int s =0;
			for(j=i;j<n;j++) {
				s=s+a[j];
				if(s==target) {
					f=f+1;//f++;
					//for(k=i;k<=j;k++) {
						//System.out.print(a[k]+" ");
					//}
					//System.out.println(" ");
				}
			}
		}
		System.out.println(f);
		//if(f==0) {
			//System.out.println(" ");
		//}
	}

}
