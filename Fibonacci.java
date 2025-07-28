package sony;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n = obj.nextInt();
		
		int a=0,b=1;
		int count =2;
		System.out.print(a+" ");
		for(count=0;count<=n;count++) {
			System.out.print(b +" ");
			int  temp =b;
			b=b+a;
			a= temp;
			count++;
				
		}
		/*for(a= 0;a<8;a++) {
			System.out.print(a +" ");
			int temp=a;
			a=b;
			b=b+temp;
		}*/
		
	}

}
