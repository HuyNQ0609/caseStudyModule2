package program.views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerformFunction {
    private final Scanner input = new Scanner(System.in);

    private int choose() {
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }
    public void selectAManagementSection(int choice) {
        switch (choice) {
            case 1 -> {
                do {
                    System.out.println("""
                            
                            Staff manager
                            
                            1. Add new staff
                            2. Edit staff
                            3. Delete staff
                            4. Search staff information
                            5. Arrange full-time staff by salary
                            6. Arrange part-time staff by working hours
                            7. The total salary must be paid to the entire staff
                            8. The average salary must be paid to the staff in the shop
                            0. Back to show manager program
                            """);
                    try {
                        choose();
                    } catch (InputMismatchException e) {
                        System.out.println("Error! Please choose again!");
                    }
                } while (true);
            }
            case 2 -> {
                do {
                    System.out.println("""
                            
                            Product manager
                            
                            1. Add new product
                            2. Edit product
                            3. Delete product
                            4. Search product
                            5. Arrange products by price
                            6. Product price editing
                            """);
                    try {
                        choose();
                    } catch (InputMismatchException e) {
                        System.out.println("Error! Please choose again!");
                    }
                } while (true);
            }
            case 3 -> {
                do {
                    System.out.println("""
                            
                            Customer manager
                            
                            1. Show customer information
                            2. Showing a list of products customers bought
                            3. Display the total amount of money the customer has paid
                            """);
                    try {
                        choose();
                    } catch (InputMismatchException e) {
                        System.out.println("Error! Please choose again!");
                    }
                } while (true);
            }
            case 0 -> showManagerProgram();
            default -> System.out.println("Please choose again!");
        }
    }

    public void showManagerProgram() {
        PerformFunction performFunction = new PerformFunction();
        do {
            System.out.println("""
                            
                    Beverage management
                            
                    1. Staff manager
                    2. Product manager
                    3. Customer manager
                    """);
            System.out.println("Enter your choice: ");
            try {
                int choice = input.nextInt();
                performFunction.selectAManagementSection(choice);
            } catch (InputMismatchException e) {
                System.err.println("Error! Please choose again!");
            }
        } while(true);
    }
}
