package Loops;

import java.util.Scanner;
import java.math.BigInteger;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        BigInteger a= sc.nextBigInteger();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        int n=1;

       BigInteger power=BigInteger.ONE;
        while(n<=b){
            power=power.multiply(a);
            n++;
        }
        System.out.println(a+"raise to "+b+"is"+power);
    }
}
