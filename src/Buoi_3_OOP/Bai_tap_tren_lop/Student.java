package Buoi_3_OOP.Bai_tap_tren_lop;

import Buoi5.BTVN.Bai1.Person;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float CRITERIA = 2;

    public int ID = 1000;

    public Student() {
        super();
        System.out.println();
        ID = ID+ 1;
        this.id = ID;
        gpa = 0;
        nameClass = "";
    }

    public int getId() {
        return this.id;
    }
}
