package jjaavvaa;
//electricity bill units

import java.io.*;
import java.util.*;

public class current_bill{

    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int cost = 0;
        
        if(n<=100)
            cost = n*6;
        else if(n<=200)
            cost = 100*6+(n-100)*8;
        else if(n<=300)
            cost = 100*6 +100*8+(n-200)*10;
        else if(n<=400)
            cost = 100*6 +100*8+100*10+(n-300)*12;
        else if (n>400)
            cost = 100*6 + 100*8 + 100*10 + 100*12 + (n-400)*14;
    
    System.out.println(cost);
    } 
}