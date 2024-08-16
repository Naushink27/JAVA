package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter A number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        int temp=0;
        int sum=0;
//        while(n!=0){
//            temp=n%10;
//            n=n/10;
//            System.out.print(temp);
//        }
while(n>0){
    temp=temp*10+n%10;
     n/=10;
}
        System.out.println(temp);
    }
}
