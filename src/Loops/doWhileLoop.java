package Loops;
import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i=3;
        do{
            i++;
            if(i==3) {
                continue;

            }
            System.out.print("cube of"+i);

            System.out.println("="+i*i*i);


        }while (i<=n);
    }
}
