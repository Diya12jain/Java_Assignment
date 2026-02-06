package NewAssignment;

import java.util.Scanner;

public class Reverse_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int r = 0, rev = 0, sum = 0, count = 0;
        int n = num;
        if (num < 0) {
            num = -num;
        }
        while (num > 0) {
            r = num % 10;
            sum += r;
            count++;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (n < 0) {
            rev = -rev;
        }
        System.out.println("The reverse of the number is:" + rev);
        System.out.println("The sum of the number is:" + sum);
        System.out.println("Total digits in the given number is:" + count);
        sc.close();
    }
}
