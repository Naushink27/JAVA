package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        int[] arr; //declaration
        Scanner sc= new Scanner(System.in);
        arr=new int[5]; //intialization
        System.out.println(arr[0]);
        String[] str=new String[5];
        System.out.println(str[2]);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+"th element");
            arr[i]= sc.nextInt();

        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
//        for(int i:arr){
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
