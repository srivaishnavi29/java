package jjaavvaa;
import java.util.*;
public class LeaderBoardPositionArray {
	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for( i = 0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int small = a[n-1];
		for(i=n-2 ; i>0 ; i--) {
			if(a[i] > small) {
				System.out.print(a[i]+" ");
				small = a[i];
			}
		}
		
		
	}

}
