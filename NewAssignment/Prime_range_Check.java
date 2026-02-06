package NewAssignment;

import java.util.Scanner;

public class Prime_range_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number from which you start to check the prime numbers:");
        int first_num = sc.nextInt();
        System.out.print("Enter the second number you want to finish the range to check the prime numbers:");
        int second_num = sc.nextInt();
        String prime_num = "";
        for (int i = first_num; i <= second_num; i++) {
            int is_prime = 1;
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    is_prime = 0;
                    break;
                }
            }
            if (is_prime == 1) {
                prime_num = prime_num + " " + i;
            }
        }
        System.out.println("The prime numbers between" + " " + first_num + " and " + second_num + " are:");
        System.out.println(prime_num);
        sc.close();
    }
}
