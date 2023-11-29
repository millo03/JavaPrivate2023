package Buoi6.Ly_thuyet;

import java.util.ArrayList;

public class AnimalServiceImpl implements AnimalService{
    //implements: triển khai
    ArrayList<Integer> list ;

    public AnimalServiceImpl() {
        this.list = new ArrayList<>();
    }

    public AnimalServiceImpl(ArrayList<Integer> list) {
        this.list = list;
    }

    Animal a= new Dog("1");
    @Override
    public void nhapSo(int a) {// bắt buộc giống interface
        list.add(a);
    }

    @Override
    public void hienThi() {
        for(Integer x: list){
            System.out.print(x+"     ");

        }
    }
}
