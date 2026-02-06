package NewAssignment;

import java.util.Scanner;

public class Num_Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to classify it : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Given number is negative");
        } else if (num > 0) {
            System.out.println("Given number is positive");
        } else {
            System.out.println("Given number is zero");
        }
        if (num % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Given number is divisible by both 5 and 7");
        } else {
            System.out.println("Given number is not divisible by 5 and 7 both");
        }
        sc.close();
    }
}
