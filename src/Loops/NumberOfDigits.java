package Loops;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println("enter A number");
     Scanner sc=new Scanner(System.in);

     int n=sc.nextInt();
    int count=0;
    while(n!=0){
        n=n/10;
        count++;
    }
        System.out.println("Number of digits ="+count);
    }
}
