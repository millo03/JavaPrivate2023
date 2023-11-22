package Buoi5.BtTrenLop;

public class Preson1 {
    private String name;
    private int age;
    private String address;

    public Preson1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Preson1() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void output(){
        System.out.printf("%-15s%-15d%-15s",name,age,address);
    }
}
