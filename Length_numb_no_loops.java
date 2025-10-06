package jjaavvaa;
import java.util.*;
public class Length_numb_no_loops {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int len = String.valueOf(Math.abs(n)).length();
		System.out.println(len);
	}
}
