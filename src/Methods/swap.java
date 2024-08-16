package Methods;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
      int a=10;
      int b=20;
        swap(a,b);
        System.out.println(a+""+b);
    }
    static void swap(int num1,int num2) {
        int temp =num1;
        num1=num2;
        num2=temp;

    }
    //it is pass by refrence thats why it isnt changing i.e, num1&num2 are addresing to different object.
}
