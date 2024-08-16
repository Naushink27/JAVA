package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
          int ans=sum1();
        System.out.println();
    }
    static int sum1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number 2");
        int num2= sc.nextInt();
        int sum= num1+num2;
//        System.out.println("Sum is "+sum);
        return sum;
    }
}
