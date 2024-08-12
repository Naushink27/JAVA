package decisionMaking;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        // Check if the character is uppercase
        if (ch >= 65 && ch <= 90) {
            System.out.println("Entered character is capital.");
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }
        // Check if the character is lowercase
        else if (ch >= 97 && ch <= 122) {
            System.out.println("Entered character is small.");
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
        }
    }
}
