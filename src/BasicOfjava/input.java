package BasicOfjava;

import java.util.Scanner;
public class input {
    public static void main(String[]args){
//   Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Radius:");
//        double pi=3.142;
//        double radius =sc.nextInt();
//        double result=pi*radius*radius;
//        System.out.println("Area of circle is:"+result);

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age:");
        int age= sc.nextInt();
        System.out.println("enter your  Name::");
        String Name= sc.next();

        System.out.println("enter your Gender:");
        char gen= sc.next().charAt(0);

        System.out.println("NAme is"+Name);
        System.out.println("age is"+age);
        System.out.println("Gender is "+gen);
        System.out.println("Gender is "+gen);
        }
}
