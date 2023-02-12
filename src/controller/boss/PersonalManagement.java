package controller.boss;

import model.Laborer;
import model.Product;

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
    public void addLaborer(Laborer laborer) {
        laborerList.add(laborer);
    }
    /* Edit laborer information */
    public void editLaborer(int index, Laborer laborer) {
        laborerList.set(index, laborer);
    }
    /* Delete laborer */
    public void deleteLaborer(int index) {
        laborerList.remove(index);
    }
}
