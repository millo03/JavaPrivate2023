package Buoi6.Ly_thuyet;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override// bắt buộc có phương thức trừu tượng khi lơp cha có
    public void speak(){
        System.out.println("speak");
    }


}
