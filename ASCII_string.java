package jjaavvaa;

import java.util.Scanner;

public class ASCII_string {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String str =obj.next();
		int i,n = str.length();
		for(i=0;i<n;i++){
			System.out.print((int)str.charAt(i)+" ");
		}
	}
}
