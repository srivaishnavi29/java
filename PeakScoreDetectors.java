package jjaavvaa;
import java.util.*;
public class PeakScoreDetectors {
	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for( i = 0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int peak = a[0];
		for(i=1 ; i<n-1 ; i++) {
			if(a[i] > peak) {
				System.out.print(a[i]+" ");
				peak = a[i];
			}
		}
		
		
	}

}
