package jjaavvaa;
import java.util.*;

public class atm {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int  d5,d1;
		int choice , amt;
		int last_withdraw = 0;
		
		System.out.println("Enter initial ATM load (count of 500s and 100s): ");
		d5 = in.nextInt();
		d1 = in.nextInt();
		
		while(true) {
			System.out.println("----------------------------ATM MENU--------------------------------");
			System.out.println("1. WITHDRAW AMOUNT");
			System.out.println("2.CHECK ATM STATUS");
			System.out.println("3. DEPOSIT NOTES");
			System.out.println("4. MINI STATEMENT");
			System.out.println("5. EXIT");
			System.out.println("ENTER YOUR CHOICE:\t");
			
			choice = in.nextInt();
			
			switch(choice) {
			case 1: { 
				System.out.println("Enter amount to withdraw:\t");
				amt = in.nextInt();
				if(amt> 10000) {
					System.out.println("Remember : at a time you can withdraw only  10000");
					break;
				}
				else if (amt % 100 != 0) {
					System.out.println("Enter multiples of 100 only");
					break;
				}
				
				else if (amt<=500) {
					int need100 = amt/100;
					if( need100> d1) {
						System.out.println("ATM doesn't have enough 100's");
						break;
					}
					d1=d1-need100;
					System.out.println("Cash Dispensed:");
					System.out.println("500s = 0");
					System.out.println("100s = "+need100);
					last_withdraw = amt;
					break;
				}
				else if(amt>=500) {
					int need100=5;
					int use500 = (amt-500)/500;
					
					need100=need100+(((amt-500)%500)/100);
					if(need100>5) {
						need100=need100-5;//need100 -= 5;
						use500=use500+1;// use500+=1;
					}
					if(need100>d1) {
						System.out.println("ATM doesn't have enough 100s");
						break;
					}
					if(use500>d5) {
						System.out.println("ATM doesn't have enough 500s");
						break;
					}
					d1 -= need100;
					d5 -= use500;
					System.out.println("Cash Dispensed");
					System.out.println("500s = "+use500);
					System.out.println("100s = "+need100);
					last_withdraw = amt;
					break;
				}
			}
			case 2: {
				System.out.println("------------------------------------------------ATM STATUS---------------------------------------------------");
				System.out.println("500s Available : " + d5);
				System.out.println("100s Available : " + d1);
				System.out.println("Total cash : " +d5*500 + d1*100);
				break;
				}
			case 3: {
				System.out.println("Enter number of 500s to add:");
				int add5 = in.nextInt();
				System.out.println("Enter number of 100s to add:");
				int add1 = in.nextInt();
				
				d1+=add1;
				d5 += add5;
				
				System.out.println("Notes are added Successfully ");
				break;}
			case 4: {
				if(last_withdraw == 0) {
					System.out.println("No transaction made yet");
				}
				else
						System.out.println("Your last transaction is"+last_withdraw);
				
				break;
				}
			case 5: {
				System.out.println("Thankyou ! visit again");
				return;
				}
			default:{
				System.out.println("Invalid choice. Try Again");
			}
			}
		}
		
	}
}
