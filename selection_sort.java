package jjaavvaa;
import java.util.*;


public class selection_sort {

    public static void main(String[] args) {
        int i;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(i=0;i<n ; i++){
            a[i] = obj.nextInt();
        }
        for(i = 0;i<n-1 ; i++){
            int min =i;
            for(int j = i+1 ; j<n ; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int swap = a[min];
            a[min] = a[i];
            a[i] = swap;
        }
            for(i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
        
        
    }
