package program.controller;

import program.model.*;
import program.storage.ReadAndWrite;

import java.util.*;

public class StaffManager {
    List<Personal> staffList;

    public StaffManager() {
        staffList = new ArrayList<>();
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
    public void editStaff(String name) {
        int index;
        for (Personal personal: staffList) {
            if (name.equals(personal.getName())) {
                index = staffList.indexOf(personal);
                staffList.set(index, personal);
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
    public List<Personal> showListStaff() {
        return staffList;
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
    public List<FullTimeStaff> sortHardSalary() {
        List<FullTimeStaff> fullTimeStaffs = new ArrayList<>();
        for (Personal staff : staffList) {
            if (staff instanceof FullTimeStaff)
                fullTimeStaffs.add((FullTimeStaff) staff);
        }
        Collections.sort(fullTimeStaffs);
        return fullTimeStaffs;
    }

    /* Sort part-time employees by working hours */
    public List<PartTimeStaff> sortHour() {
        List<PartTimeStaff> partTimeStaffs = new ArrayList<>();
        for (Personal staff : staffList) {
            if (staff instanceof PartTimeStaff)
                partTimeStaffs.add((PartTimeStaff) staff);
        }
        Collections.sort(partTimeStaffs);
        return partTimeStaffs;
    }
}
