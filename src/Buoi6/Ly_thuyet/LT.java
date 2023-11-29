package Buoi6.Ly_thuyet;

import Buoi5.BTVN.Bai1.Address;

import java.util.ArrayList;
import java.util.List;

public class LT {
    /**
     *Interface:
     - ko tạo được constructor
     - bắt buộc định nghĩa method abstract
     -implements: triển khai
     - cho phép đa kế thừa
     *Abstract: trừu tượng
     - lớp trừu tượng, ko thể khởi tạo object từ abstract
     - chứa phương thức trừu tượng( abstract method)
     - lớp trừu tượng cha có method abstract thì lớp con bắt buộc override của method abstract đó
     - lớp trừu tượng ko cần có method abstract, còn method abstract bắt buộc thuộc 1 lớp abstract
     * =========Trừu tượng============
     - ẩn đi những chi tiết phức tạp
     - tập chung vòa đối tượng hành vi
     - thường cho 1 class kế thừa đè method trùng(override 100%)
     *down-casting
     - biến lớp con tham chiều sang lớp cha
     - Animal a = new Dog();
     - a.out(); .. chỉ gọi đến phương thức ghi đè của lớp con đã ghi dè lớp cha
     * up-casting
     - ngượi l
     */
    public static void main(String[] args) {
        List<Address> a = new ArrayList<>();// up-casting

            Animal b = new Dog("m");
            b.speak();// chỉ đến speak của Animal
        AnimalService c = new AnimalServiceImpl();
        c.nhapSo(5);
        c.nhapSo(6);
        c.nhapSo(7);
        c.nhapSo(8);
        c.hienThi();


    }
}
