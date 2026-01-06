package jjaavvaa;
import java.util.*;
public class Optimized_Binary_search {
	public static void main(String args[]) {
		int i;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int target = obj.nextInt();
		Arrays.sort(a);
		
		int find = -1;
		int l = 0,h=n-1;
		while(l<=h) {
		int mid=(l+h)/2;
		
	
		if(target == a[mid]) {
			find = mid;
			h = mid-1;
		}
		else if(target<a[mid]) {
			h=mid-1;
		}
		else {
			l = mid+1;
		}
		}
		System.out.println(find);
	
	}

}
