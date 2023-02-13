package program.views;

import program.controller.boss.PersonalManagement;
import program.model.FullTimeStaff;
import program.model.PartTimeStaff;

import java.util.Scanner;

public class Program {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PersonalManagement personalManagement = new PersonalManagement();
        personalManagement.add(new FullTimeStaff(1, "David Beckham", 46,
                                    "Washington", "david@gmail.com", 436235355,
                                    10000000, 1500000, 500000));
        personalManagement.add(new FullTimeStaff(2, "Cristiano Ronaldo", 38,
                "London", "ronaldo@gmail.com", 291987593,
                9000000, 1000000, 300000));
        personalManagement.add(new FullTimeStaff(3, "Lionel Messi", 36,
                "Argentina", "messi@gmail.com", 434648589,
                11000000, 1500000, 300000));
        personalManagement.add(new PartTimeStaff(4, "Edison Cavani", 36,
                "Uruguay", "cavani@gmail.com", 592385733, 124));
        personalManagement.add(new PartTimeStaff(5, "Harry Maguire", 33,
                "England", "maguire@gmail.com", 986124692, 92));
        personalManagement.add(new PartTimeStaff(6, "Fernando Torres", 43,
                "Spain", "torres@gmail.com", 837498231, 111));
        for (int i = 0; i < personalManagement.getLaborerList().size(); i++) {
            System.out.println(personalManagement.getLaborerList().get(i));
        }
//        System.out.println("Enter the name you want to search: ");
//        String name = input.nextLine();
//        personalManagement.searchStaff(personalManagement.getLaborerList(), name);
    }
}