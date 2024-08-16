package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("enter A number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        int temp;
        int sum=0;
        while(n!=0){
       temp=n%10;
       n=n/10;
       sum+=temp;
        }
        System.out.println("Sum of Digits are: ="+sum);
    }
}
