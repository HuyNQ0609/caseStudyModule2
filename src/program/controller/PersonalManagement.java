package program.controller;

import program.model.Personal;
import program.storage.ReadAndWrite;

import java.util.List;

public class PersonalManagement {
    List<Personal> personalList = ReadAndWrite.getInstance().readFilePersonal();

    public PersonalManagement() {
    }

    public PersonalManagement(List<Personal> personalList) {
        this.personalList = personalList;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    /* Add new staff */
    public void add(Personal personal) {
        personalList.add(personal);
        ReadAndWrite.getInstance().writeFilePersonal(personalList);

    }

    /* Edit staff information */
    public void editPersonal(int id) {
        int index;
        for (Personal personal: personalList) {
            if (personal.getId() == id) {
                index = personalList.indexOf(personal);
                personalList.set(index, personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFilePersonal(personalList);
    }

    /* Delete staff */
    public void deleteStaff(int id) {
        for (Personal personal: personalList) {
            if (personal.getId() == id) {
                personalList.remove(personal);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFilePersonal(personalList);
    }

    /* Search staff information */
    public String searchStaff(int id) {
        for (Personal personal: personalList) {
            if (personal.getId() == id) {
                return "" + personal;
            }
        }
        return "Staff not found!";
    }
}
