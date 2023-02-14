package program.views;

import login.UserExample;

import java.util.Scanner;

public class Program {
    private static final Scanner input = new Scanner(System.in);

    private static void loginUser() {
        UserExample userExample = new UserExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Login your account");
        while (true) {
            System.out.println("Enter account: ");
            String account = input.nextLine();
            System.out.println("Enter password: ");
            String password = input.nextLine();
            if(userExample.validateAccount(account) && userExample.validatePassword(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login unsuccessful. Please login again!");
            }
        }
    }

    public static void main(String[] args) {
        loginUser();
    }
}