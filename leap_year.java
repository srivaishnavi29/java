package jjaavvaa;
import java.util.*;
public class leap_year {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int year=src.nextInt();
		String isString = ((year%4 == 0)&&((year%100!=0)||(year%400==0)))?"Yes":"No";
		System.out.println(isString);
		
	}
}
