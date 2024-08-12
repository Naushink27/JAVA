package decisionMaking;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter A number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("absolute value of number is :"+num);
        }
        else{
            int num2=Math.abs(num);
            System.out.println("Absolute value is :"+ num2);
        }
    }

}
