package controller;

import model.School;
import view.SchoolManagement;

public class Test {
    public static void main(String[] args) {
        School hoavang = new School();
        SchoolManagement mananage1 = new SchoolManagement(hoavang);
            mananage1.execute();
    }
}
