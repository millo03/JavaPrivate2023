package Buoi5.BtTrenLop;

public class Student1 extends Preson1{
    private double gpa;


    public Student1(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public Student1() {
        super();
        this.gpa = 0;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public void output() {
        super.output();
        System.out.printf("%-15g\n",gpa);
    }
}
