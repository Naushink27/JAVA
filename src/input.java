import java.util.Scanner;
public class input {
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double pi=3.142;
        double radius =sc.nextInt();
        double result=pi*radius*radius;
        System.out.println("Area of circle is:"+result);
    }
}
