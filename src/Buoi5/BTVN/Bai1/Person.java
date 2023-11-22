package Buoi5.BTVN.Bai1;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Address address= new Address();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
        this.name = "";
        this.age =0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Address setAddress(Address address) {
//        System.out.println(address.getCity());
//        this.address.setCity(address.getCity());
//        this.address.setCommune(address.getCommune());
//        this.address.setDistrict(address.getDistrict());
//        return this.getAddress();
//    }

    public void input(Scanner sc){
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Age: ");
        setAge(sc.nextInt());
        sc.nextLine();
        address.input(sc);
    }
    public void output(){
        System.out.printf("%-17s%-10d",name,age);
        address.output();
    }
}
