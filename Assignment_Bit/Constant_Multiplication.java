package Assignment_Bit;

import java.util.Scanner;

public class Constant_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int result = (x << 3) - x;
        System.out.println("Result after multiply given number by 7 : " + result);
        sc.close();
    }
}
