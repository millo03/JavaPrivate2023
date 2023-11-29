package Buoi6.Ly_thuyet;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void speak();
    public void eat(){
        System.out.println("eat");
    }
}
