package decisionMaking;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day of week");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("its Monday");
                break;
            case 2:
                System.out.println("its tuesday");
                break;

            case 3:
                System.out.println("its Wednesday");
                break;
            case 4:
                System.out.println("its thursday");
                break;
            case 5:
                System.out.println("its friday");
                break;
            case 6:
                System.out.println("its Saturday");
                break;
            case 7:
                System.out.println("its Sunday");
                break;
        }
        switch (day){
            case 1,2,3,4,5:
                System.out.println("its a Weekday");
                break;
            case 6,7:
                System.out.println("its  a Weekend");
                break;
        }
    }
}
