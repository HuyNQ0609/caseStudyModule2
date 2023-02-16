package program.views;

import program.controller.*;
import program.model.*;

import java.util.*;

public class PerformFunction {
    List<Personal> employees = new ArrayList<>();
    StaffManager staffManager = new StaffManager(employees);
    private final Scanner input = new Scanner(System.in);

    private int choose() {
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }

    public void showManagerProgram() {
        PerformFunction performFunction = new PerformFunction();
        do {
            System.out.println("""
                            
                    Management section
                            
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
                            5. Show list staff information
                            6. Arrange and display a full-time staff list according to salary
                            7. Arrange and display a part-time staff list according to working hours
                            8. The total salary must be paid to the entire staff
                            9. The average salary must be paid to the staff in the shop
                            0. Back to show management section
                            """);
                    try {
                        showStaffManager(choose());
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
                            0. Back to show management section
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
                            0. Back to show management section
                            """);
                    try {
                        choose();
                    } catch (InputMismatchException e) {
                        System.out.println("Error! Please choose again!");
                    }
                } while (true);
            }
            case 0 -> System.exit(choice);
            default -> System.out.println("Please choose again!");
        }
    }

    public void showStaffManager(int numberChoose) {
        switch (numberChoose) {
            case 1 -> staffManager.addStaff();
            case 2 -> staffManager.editStaff();
            case 3 -> staffManager.deleteStaff();
            case 4 -> staffManager.searchStaff();
            case 5 -> showListStaff();
            case 6 -> printStaffList();
            case 7 -> System.out.println("\nAverage salary of employees: " +
                    staffManagers.getAverageSalary());
            case 8 -> System.out.println("\nEmployees whose wages are lower than the median salary are: " +
                    staffManagers.listedStaff());
            case 9 -> System.out.println("The salary payable to all part-time employees is" +
                    staffManagers.getTotalSalary());
            case 10 -> System.out.println(staffManagers.sortHardSalary());
            case 0 -> showManagerProgram();
            default -> System.out.println("Please choose again!");
        }
    }
    /* Show list staff information */
    public void showListStaff() {
        for (Personal staff : employees) {
            System.out.println(staff);
        }
    }

    public int enterId() {
        System.out.println("Enter id: ");
        return input.nextInt();
    }

    public String enterName() {
        System.out.println("Enter name: ");
        return input.nextLine();
    }

    public int enterAge() {
        System.out.println("Enter age: ");
        return input.nextInt();
    }

    public String enterAddress() {
        System.out.println("Enter address: ");
        return input.nextLine();
    }

    public String enterEmail() {
        System.out.println("Enter email: ");
        return input.nextLine();
    }

    public int enterPhoneNumber() {
        System.out.println("Enter phone number: ");
        return input.nextInt();
    }
}
