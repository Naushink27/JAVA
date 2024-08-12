package decisionMaking;
import java.util.Scanner;
public class evenOdd {

    public static void main(String[] args) {
        System.out.println("Enter a number you wanna check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}

