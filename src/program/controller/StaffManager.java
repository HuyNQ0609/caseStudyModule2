package program.controller;

import program.model.Personal;
import program.storage.ReadAndWrite;

import java.util.*;

public class StaffManager {
    List<Personal> personalList;

    public StaffManager() {
        personalList = new ArrayList<>();
    }

    public StaffManager(List<Personal> personalList) {
        this.personalList = personalList;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    /* Add new staff */
    public void addStaff(Personal personal) {
        personalList.add(personal);
        ReadAndWrite.getInstance().writeFilePersonal(personalList);
    }

    /* Edit staff information */
    public void editStaff(String name) {
        int index;
        for (Personal personal: personalList) {
            if (name.equals(personal.getName())) {
                index = personalList.indexOf(personal);
                personalList.set(index, personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFilePersonal(personalList);
    }

    /* Delete staff */
    public void deleteStaff(String name) {
        for (Personal personal: personalList) {
            if (name.equals(personal.getName())) {
                personalList.remove(personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFilePersonal(personalList);
    }

    /* Search staff information */
    public String searchStaff(String name) {
        for (Personal personal: personalList) {
            if (name.equals(personal.getName())) {
                return "" + personal;
            }
        }
        return "Staff not found!";
    }
}
