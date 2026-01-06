package jjaavvaa;

import java.util.Scanner;

public class insertion_sort {
	public static void main(String[] args) {
        int i;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(i=0;i<n ; i++){
            a[i] = obj.nextInt();
        }
        //int key = obj.nextInt();
        for( i = 1;i<n;i++) {
        	int j = i-1;
        	int key =a[i];
        	while(j>=0 && a[j]>key) {
        		a[j+1] = a[j];
        		j--;
        	}
        	a[j+1] = key;
        }
        for(i = 0; i<n ;i++) {
        	System.out.print(a[i]+" ");
        }
	}
}
