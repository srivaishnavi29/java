package jjaavvaa;

import java.util.Scanner;

public class FrequencyofElements {
	public static void main(String args[]) {
		int i,j;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int visited[] = new int[n];
		//int c = 1;
		
		for(i=0;i<n;i++) {
			if(visited[i] == 0) {
				int c = 1;
				for(j=i+1;j<n;j++) {
					if(a[i] == a[j]) {
						c++;
						visited[j] = 1;
					}
				}
				System.out.print(a[i]+" "+c+" ");
				visited[i] = 1;
			}
		}
	}

}
