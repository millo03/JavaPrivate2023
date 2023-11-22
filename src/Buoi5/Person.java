package Buoi5;

import java.util.Scanner;

public class Person {
    protected   String name;
    protected Byte age;
    protected Scanner sc = new Scanner(System.in);
    public Person() {
        name= "" ;
        age = 0;
    }

    public Person(String name, Byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
    public void input(){
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Age: ");
        age = sc.nextByte();
    }
    public void output(){
        System.out.printf("%-15s %-15d",name,age);
    }
}
