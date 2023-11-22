package Buoi5;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private static void title(){
            System.out.printf("%-15s %-15s%-15s\n","Name","Age","nameClass" );
    }
    static List <Student> list = new ArrayList<>();

    public static void add(){
        Student a = new Student();
        a.input();
        list.add(a);
    }
    public static void display(){
        title();
        for (Student a:list) {
            a.output();
        }
    }
    public static void main(String[] args) {
            add();
            add();
            add();
            display();
    }
}
