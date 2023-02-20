package program.controller.manager;

import program.model.*;
import program.storage.ReadAndWrite;

import java.util.*;

public class StaffManager {
    List<Personal> staffList;

    public StaffManager() {
        staffList = ReadAndWrite.getInstance().readFileStaff();
    }

    public StaffManager(List<Personal> staffList) {
        this.staffList = staffList;
    }

    public List<Personal> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Personal> staffList) {
        this.staffList = staffList;
    }

    /* Add new staff */
    public void addStaff(Personal personal) {
        staffList.add(personal);
        ReadAndWrite.getInstance().writeFileStaff(staffList);
    }

    /* Edit staff information */
    public void editStaff(String name, Personal personal) {
        for (int i = 0; i < staffList.size(); i++) {
            if (name.equals(staffList.get(i).getName())) {
                staffList.set(i, personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileStaff(staffList);
    }

    /* Delete staff */
    public void deleteStaff(String name) {
        for (Personal personal: staffList) {
            if (name.equals(personal.getName())) {
                staffList.remove(personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileStaff(staffList);
    }

    /* Search staff information */
    public String searchStaff(String name) {
        for (Personal personal: staffList) {
            if (name.equals(personal.getName())) {
                return "" + personal;
            }
        }
        return "Staff not found!";
    }

    /* Show list staff information */
    public void showListStaff() {
        for (Personal personal: staffList) {
            System.out.println(personal);
        }
    }

    /* Average salary of employees */
    public double getAverageSalary() {
        int size = staffList.size();
        return (getTotalSalary() / size);
    }
    /* Total salary of employees */

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Personal staff : staffList) {
            totalSalary = totalSalary + staff.getMoney();
        }
        return totalSalary;
    }

    /* Sort full-time employees by salary ascending */
    public void sortHardSalary() {
        List<FullTimeStaff> fullTimeStaffList = new ArrayList<>();
        for (Personal staff : staffList) {
            if (staff instanceof FullTimeStaff)
                fullTimeStaffList.add((FullTimeStaff) staff);
        }
        Collections.sort(fullTimeStaffList);
        for (Personal staff : fullTimeStaffList) {
            System.out.println(staff);
        }
    }

    /* Sort part-time employees by working hours */
    public void sortHour() {
        List<PartTimeStaff> partTimeStaffList = new ArrayList<>();
        for (Personal staff : staffList) {
            if (staff instanceof PartTimeStaff)
                partTimeStaffList.add((PartTimeStaff) staff);
        }
        Collections.sort(partTimeStaffList);
        for (Personal staff : partTimeStaffList) {
            System.out.println(staff);
        }
    }
}
