import java.util.Scanner;
public class swap{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x value:");
        int x = obj.nextInt();
        System.out.println("Enter y value:");
        int y = obj.nextInt();
        System.out.println("x: "+x+"\ty: "+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x: "+x+"\ty: "+y);
    }
}