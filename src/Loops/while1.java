package Loops;
import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int n= sc.nextInt();
        int sum=0;
        while(i<=n){
            System.out.print(i+"+");
            sum=sum+i;
            i++;
        }
        System.out.println("="+sum);
    }
}
