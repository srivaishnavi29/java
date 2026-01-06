package jjaavvaa;
import java.util.*;
public class EvenOddArray {
	public static void main(String[] args) {
		int i;	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		int odd[]=new int[n];
		int even[] = new int[n];
		int ev = 0,od =0;
		
		int a[] = new int[n];
		for( i = 0;i<n;i++) {
			a[i]=in.nextInt();
			if(a[i] % 2 == 0) {
				even[ev] = a[i];
				ev++;
			}
			else {
				odd[od] = a[i];
				od++;
			}
		
		}
		
		if(od == 0) {
			System.out.print(od);
		}else {
			for( i = 0;i<od;i++) {
				System.out.print(odd[i]+" ");
			}
		}
		
		System.out.println();
		
		if(ev == 0) {
			System.out.println(ev);
		}else {
			for( i = 0;i<ev;i++) {
				System.out.print(even[i]+" ");
			}
		}
	}
}
