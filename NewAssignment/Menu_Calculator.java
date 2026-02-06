package NewAssignment;

import java.util.Scanner;

public class Menu_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter your choice:\n1. For Addition.\n2. For Subtraction.\n3.For Multiplication\n4.For Division\n5.For Modulus.");
        int menu = sc.nextInt();
        System.out.println("Enter first number:");
        int first_num = sc.nextInt();
        System.out.println("Enter second number:");
        int second_num = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println(
                        "The Addition of " + first_num + " and " + second_num + " is : " + (first_num + second_num));
                break;
            case 2:
                System.out.println(
                        "The Subtraction of " + first_num + " and " + second_num + " is : " + (first_num - second_num));
                break;
            case 3:
                System.out.println("The Multiplication of " + first_num + " and " + second_num + " is : "
                        + (first_num * second_num));
                break;
            case 4:
                System.out.println(
                        "The Division of " + first_num + " and " + second_num + " is : " + (first_num / second_num));
                break;
            case 5:
                System.out.println(
                        "The Modulus of " + first_num + " and " + second_num + " is : " + (first_num % second_num));
                break;
            default:
                System.out.println("Invalid choice... Please select a valid option.");
        }
        sc.close();
    }
}
