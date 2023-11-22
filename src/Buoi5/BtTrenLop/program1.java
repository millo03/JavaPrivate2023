package Buoi5.BtTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class program1 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student1> students = new ArrayList<>();
    static ArrayList<Teacher1> teachers = new ArrayList<>();

    public static void title(int t){
        if(t == 0) {
            System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Age", "Address", "Salary");
            teachers.forEach(i -> i.output());
        }else {
            System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Age", "Address", "GPA");
            students.forEach(i-> i.output());
        }
    }
    public static void addStudent(){
        Student1 a= new Student1();
        System.out.print("Name: ");
        a.setName(sc.nextLine());
        System.out.print("Age: ");
        a.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        a.setAddress(sc.nextLine());
        System.out.print("GPA: ");
        a.setGpa(sc.nextInt());
        sc.nextLine();
        students.add(a);
    }
    public static void addTeacher(){
        Teacher1 a= new Teacher1();
        System.out.print("Name: ");
        a.setName(sc.nextLine());
        System.out.print("Age: ");
        a.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        a.setAddress(sc.nextLine());
        System.out.print("Salay: ");
        a.setSalary(sc.nextInt());
        sc.nextLine();
        teachers.add(a);
    }

    public static void main(String[] args) {
        addStudent();
        addStudent();
        addStudent();
        title(1);
        addTeacher();
        addTeacher();
        addTeacher();
        title(0);
    }

}
