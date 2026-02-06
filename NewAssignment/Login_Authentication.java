package NewAssignment;

import java.util.Scanner;

public class Login_Authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pre-defined user name:");
        String pre_user_name = sc.nextLine();
        System.out.print("Enter pre-defined password:");
        int pre_pass_word = sc.nextInt();
        sc.nextLine();
        String user_name;
        int pass_word;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter user name:");
            user_name = sc.nextLine();
            System.out.print("Enter password:");
            pass_word = sc.nextInt();
            sc.nextLine();
            if (user_name.equals(pre_user_name) && pass_word == pre_pass_word) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid credentials");
            }
        }
        sc.close();
    }
}
