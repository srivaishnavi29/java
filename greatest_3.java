package jjaavvaa;
import java.util.Scanner;
public class greatest_3 {
	    public static void main(String[] args){
	        Scanner obj = new Scanner(System.in);
	        int a,b,c;
	        a=obj.nextInt();
	        b=obj.nextInt();
	        c=obj.nextInt();
	        int large2 = (a>b)?a:b;
	        int result1 = (large2>c)?large2:c;
	        int result = ((a>b)&&(a>c))?a : ((b>a)&&(b>c))?b : c;
	        int large = Math.max(a,Math.max(b,c));
	        System.out.println(result);
	        System.out.println(result1);
	        System.out.println(large);
	    }
	}

