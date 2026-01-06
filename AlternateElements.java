package jjaavvaa;

import java.util.*;

public class AlternateElements {
	public static void main(String[] args) {
		int i,j;
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
		int index = 0;

		
		for (i = 0; i < n1 && i < n2; i++) {
            a3[index] = a1[i];
            index++;
            a3[index] = a2[i];
            index++;
        }

        for (j = i; j < n1; j++) {
            a3[index] = a1[j];
            index++;
        }

        for (j = i; j < n2; j++) {
            a3[index] = a2[j];
            index++;
        }
        System.out.println(Arrays.toString(a3));
        for (i = 0; i < index; i++) {
            System.out.print(a3[i] + " ");
        }
	}

}
