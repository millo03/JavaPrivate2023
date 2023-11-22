package Buoi5.BTVN.Bai1;

import java.util.Scanner;

public class Student2 extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float CRITERIA = 2;

    public static int ID = 0;

    public Student2() {
        ID = ID + 1;
        this.id = ID;
        gpa = 0;
        nameClass = "";
    }

    public Student2(String name, int age, int id, String nameClass, float gpa) {
        super(name, age);
        ID = ID + 1;
        this.id = ID;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public String getNameClass() {
        return nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getId() {
        return this.id;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Name Class: ");
        setNameClass(sc.nextLine());
        System.out.print("GPA: ");
        setGpa(sc.nextFloat());
        sc.nextLine();
    }
    public boolean checkFall(){
        return  gpa < CRITERIA ? true: false;
    }

    @Override
    public void output() {
        System.out.printf("%-7d",id);
        super.output();
        System.out.printf("%-19s%-10.3f",nameClass,gpa );
        System.out.printf("%-15s\n", checkFall() == true?"True": "False");
    }
}
