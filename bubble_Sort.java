package jjaavvaa;
import java.util.*;
public class bubble_Sort {
    public static void main(String args[]) {
        int i,j;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++) {
            a[i]=obj.nextInt();
        }
        
        for(i=0;i<n ; i++) {
            for (j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
        for(i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
            
    }

}
