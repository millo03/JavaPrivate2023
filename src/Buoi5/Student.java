package Buoi5;

public class Student extends Person{
    private String nameClass;

    public Student(String name, Byte age, String nameClas) {
        super(name, age);
        this.nameClass = nameClas;
    }
    public Student(){
        super();
        this.nameClass= "" ;
    }

    public String getNameClas() {
        return nameClass;
    }

    public void setNameClas(String nameClas) {
        this.nameClass = nameClas;
    }

    @Override
    public void input() {
        super.input();
        sc.nextLine();
        System.out.print("Name class: ");
        nameClass = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-15s\n",nameClass);
    }
}
