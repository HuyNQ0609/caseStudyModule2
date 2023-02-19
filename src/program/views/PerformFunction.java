package program.views;

import login.UserExample;
import program.controller.*;
import program.model.*;
import program.storage.ReadAndWrite;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PerformFunction {
    ProductManager productManager = new ProductManager();
    Customer customer;
    CustomerManager customerManager = new CustomerManager();
    StaffManager staffManager = new StaffManager();
    private final Scanner input = new Scanner(System.in);

    public void loginUser() {
        UserExample userExample = new UserExample();
        System.out.println("Login your account");
        while (true) {
            System.out.println("Enter account: ");
            String account = input.nextLine();
            System.out.println("Enter password: ");
            String password = input.nextLine();
            if(userExample.validateAccount(account) && userExample.validatePassword(password)) {
                System.out.println("Login successful!");
                if (account.equals("module2") && password.equals("CaseStudy")) {
                    showManagerProgram();
                } else {
                    showMenuCustomerManager();
                }
                break;
            } else {
                System.out.println("Login unsuccessful. Please login again!");
            }
        }
    }
    public int choose() {
        try {
            System.out.println("Enter your choice: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again: ");
        }
        return -1;
    }
    public void showManagerProgram() {
        PerformFunction performFunction = new PerformFunction();
        do {
            System.out.println("""
                            
                    Management section
                            
                    1. Staff manager
                    2. Product manager
                    3. Customer manager
                    0. Exit
                    """);
            performFunction.selectAManagementSection(choose());
        } while(true);
    }
    public void selectAManagementSection(int choice) {
        switch (choice) {
            case 1 -> showMenuStaffManager();
            case 2 -> showMenuProductManger();
            case 3 -> showMenuCustomerManager();
            case 0 -> System.exit(choice);
            default -> System.out.println("Please choose again!");
        }
    }
    private void showMenuStaffManager() {
        do {
           System.out.println("""
                   
                   Staff manager
                   
                   1. Add new full-time staff information
                   2. Add new part-time staff information
                   3. Edit full-time staff information
                   4. Edit part-time staff information
                   5. Delete staff
                   6. Search staff information
                   7. Show list staff information
                   8. Arrange and display a full-time staff list according to salary
                   9. Arrange and display a part-time staff list according to working hours
                   10. The total salary must be paid to the entire staff
                   11. The average salary must be paid to the staff in the shop
                   0. Back to show management section
                   """);
           showStaffManager(choose());
       } while (true);
    }
    private void showMenuProductManger() {
        do {
            System.out.println("""
                    
                    Product manager
                    
                    1. Add new product
                    2. Edit product
                    3. Delete product
                    4. Search product
                    5. Show list product
                    6. Arrange products information by price
                    0. Back to show management section
                    """);
            showProductManager(choose());
        } while (true);
    }
    private void showMenuCustomerManager() {
        do {
            System.out.println("""
                    
                    Customer manager
                    
                    1. Show original product list
                    2. Show customer information
                    3. Add products that customers buy to the list
                    4. Showing a list of products customers bought
                    5. Display the total amount of money the customer has paid
                    0. Back to show management section
                    """);
            showCustomerManager(choose());
        } while (true);
    }

    /**************************************************************/
    public String enterId() {
        System.out.println("Enter id: ");
        return input.nextLine();
    }
    public String enterName() {
        System.out.println("Enter name: ");
        return input.nextLine();
    }
    public int enterAge() {
        try {
            System.out.println("Enter age: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again!");
        }
        return enterAge();
    }
    public String enterAddress() {
        System.out.println("Enter address: ");
        return input.nextLine();
    }
    public String enterEmail() {
        System.out.println("Enter email: ");
        return input.nextLine();
    }
    public String enterPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone number: ");
            phoneNumber = input.nextLine();
            Pattern pattern = Pattern.compile("^\\([0-9]{2,4}\\)-[0-9]{9}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("Enter phone number again! ");
            }
        } while (true);
        return phoneNumber;
    }
    public int enterHardSalary() {
        try {
            System.out.println("Enter hard salary: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again!");
        }
        return enterHardSalary();
    }
    public int enterReward() {
        try {
            System.out.println("Enter reward: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again!");
        }
        return enterReward();
    }
    public int enterMulct() {
        try {
            System.out.println("Enter mulct: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again!");
        }
        return enterMulct();
    }
    public int enterHour() {
        try {
            System.out.println("Enter hour: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again!");
        }
        return enterHour();
    }
    public int enterQuantity() {
        try {
            System.out.println("Enter quantity: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again: ");
        }
        return enterQuantity();
    }
    public int enterPrice() {
        try {
            System.out.println("Enter price: ");
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter again: ");
        }
        return enterPrice();
    }

    /* Staff manager */
    public void showStaffManager(int numberChoose) {
        switch (numberChoose) {
            case 1 -> addNewFullTimeStaff();
            case 2 -> addNewPartTimeStaff();
            case 3 -> editFullTimeStaff();
            case 4 -> editPartTimeStaff();
            case 5 -> removeStaff();
            case 6 -> System.out.println(staffManager.searchStaff(enterName()));
            case 7 -> System.out.println(staffManager.showListStaff());
            case 8 -> System.out.println("Arrange and display a full-time staff list according to salary:\n" +
                    staffManager.sortHardSalary());
            case 9 -> System.out.println("Arrange and display a part-time staff list according to working hours:\n" +
                    staffManager.sortHour());
            case 10 -> System.out.println("The total salary must be paid to the entire staff: " + staffManager.getTotalSalary());
            case 11 -> System.out.println("The average salary must be paid to the staff in the shop: " + staffManager.getAverageSalary());
            case 0 -> showManagerProgram();
            default -> System.out.println("Please choose again!");
        }
    }
    public void addNewFullTimeStaff() {
        staffManager.addStaff(new FullTimeStaff(enterId(), enterName(), enterAge(),
                enterAddress(), enterEmail(), enterPhoneNumber(), enterHardSalary(),
                enterReward(), enterMulct()));
    }
    public void addNewPartTimeStaff() {
        staffManager.addStaff(new PartTimeStaff(enterId(), enterName(), enterAge(),
                enterAddress(), enterEmail(), enterPhoneNumber(), enterHour()));
    }
    public void editFullTimeStaff() {
        staffManager.editStaff(enterName());
    }
    public void editPartTimeStaff() {
        staffManager.editStaff(enterName());
    }
    public void removeStaff() {
        staffManager.deleteStaff(enterName());
    }

    /* Product manager */
    public void addNewProduct() {
        productManager.addProduct(new Product(enterName(), enterPrice()));
    }
    public void editProductInformation() {
        productManager.editProduct(enterName());
    }
    public void removeProduct() {
        productManager.deleteProduct(enterName());
    }
    public void showProductManager(int numberChoose) {
        switch(numberChoose) {
            case 1 -> addNewProduct();
            case 2 -> editProductInformation();
            case 3 -> removeProduct();
            case 4 -> System.out.println(productManager.searchProduct(enterName()));
            case 5 -> System.out.println(productManager.showListProduct());
            case 6 -> productManager.sortProducts();
            case 0 -> showManagerProgram();
            default -> System.out.println("Please choose again!");
        }
    }

    /* Customer manager */
    public void showCustomer() {
        customer = new Customer(enterName(),enterAge(), enterAddress(),
                                    enterEmail(),enterPhoneNumber());
        System.out.println(customer);
    }
    public void showCustomerManager(int numberChoose) {
        switch (numberChoose) {
            case 1 -> System.out.println(productManager.showListProduct());
            case 2 -> showCustomer();
            case 3 -> {
                do {
                    System.out.println("""
                    
                    Invoices
                    
                    1. Add new product to invoices
                    0. Back to show Customer Manager
                    """);
                    showCustomerManager(numberChoose);
                } while (true);
            }
            case 4 -> {
                System.out.println("The list of products selected by the customer is:\n"
                                    + customerManager.showInvoices());
            }
            case 5 -> System.out.println("The amount to be paid by the customer is: " +
                                            customerManager.getMoney());
            case 0 -> showManagerProgram();
            default -> System.out.println("Please choose again!");
        }
    }
    public void showInvoices(int numberChoose) {
        switch (choose()) {
            case 1 -> customerManager.addProductToInvoices(new CustomerInvoices(enterName(),
                                            enterPrice(), enterQuantity()));
            case 0 -> showCustomerManager(numberChoose);
            default -> System.out.println("Please choose again!");
        }
    }
}
