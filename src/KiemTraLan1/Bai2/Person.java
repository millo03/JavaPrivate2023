package KiemTraLan1.Bai2;

import java.util.Scanner;

public abstract class Person {
    private int id;
    private String name;
    private short age;
    private Address address;
    public static int ID = 0;

    public Person( String name, short age,Address address) {
        ID ++;
        this.id = ID;
        this.name = name;
        this.age = age;
        this.address= address;
    }

    public Person() {
        ID= ID+1;
        this.id= ID;
        this.name = "";
        this.age = 0;
        address = new Address();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }

    public abstract String getCapacity();

    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi:");
        age=sc.nextShort();
        sc.nextLine();
        address.input();
    }

    @Override
    public String toString() {
        return  id + "      " + name + "       " + age + "        ";
    }
}
