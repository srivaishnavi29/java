package sony;

public class reverse_no {
	public static void main(String[] args) {
		int n = 1239453;
		int ans = 0;
		System.out.println(n);
		while(n>0) {
			int rem = n%10;
			ans = ans* 10+rem;
			n=n/10;
		}
		System.out.println(ans);
	}
}
