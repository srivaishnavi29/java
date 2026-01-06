package jjaavvaa;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArraysSort {
	public static void main(String[] args) {
		int i,j,k;
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int a1[] = new int[n1];
		for( i = 0;i<n1;i++) {
			a1[i]=in.nextInt();
		}
		
		int n2 = in.nextInt();
		int a2[] = new int[n2];
		for( i = 0;i<n2;i++) {
			a2[i]=in.nextInt();
		}
		
		int a3[] = new int[n1+n2];
		

       i=j=k=0;
       while(i<n1 && j<n2) {
    	   if(a1[i]< a2[j]) {
    		   a3[k++] = a1[i++];
    	   }
    	   else {
    		   a3[k++] = a2[j++];
    	   }
       }
       
       while(i<n1) {
    	   a3[k++] = a1[i++];
       }
       
       while(j<n2) {
    	   a3[k++] = a2[j++];
       }
       for (i = 0; i < n1+n2; i++) {
           System.out.print(a3[i] + " ");
       }
	}

}
