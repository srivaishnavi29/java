package jjaavvaa;
import java.util.*;
public class LinearSearch {
	public static void main(String args[]) {
		int i;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int target = obj.nextInt();
		int find = -1;
		//Arrays.sort(a);
		for(i=0;i<n ; i++) {
			if(a[i] == target) {
				find = i;
				break;
			}
		}
		if(find == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found at "+find+" index");
		}
	}

}
