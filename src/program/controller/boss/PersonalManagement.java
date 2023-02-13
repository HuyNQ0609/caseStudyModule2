package program.controller.boss;

import program.model.Laborer;

import java.util.List;

public class PersonalManagement {
    List<Laborer> laborerList;

    public PersonalManagement() {
    }

    public PersonalManagement(List<Laborer> laborerList) {
        this.laborerList = laborerList;
    }

    public List<Laborer> getLaborerList() {
        return laborerList;
    }

    public void setLaborerList(List<Laborer> laborerList) {
        this.laborerList = laborerList;
    }

    /* Add new laborer */
    public void add(Laborer laborer) {
        try {
            laborerList.add(laborer);
        } catch (RuntimeException e) {
            System.out.println("Cannot add!");
        }
    }
    /* Edit laborer information */
    public void editLaborer(int index, Laborer laborer) {
        laborerList.set(index, laborer);
    }
    public String searchStaff(List<Laborer> laborerList, String name) {
        for (Laborer laborer : laborerList) {
            if (laborer.getName().equals(name)) {
                return "Staff information:\n" + laborer;
            }
        }
        return "The employee name does not exist!";
    }
    /* Delete laborer */
    public void deleteLaborer(int index) {
        laborerList.remove(index);
    }
}
