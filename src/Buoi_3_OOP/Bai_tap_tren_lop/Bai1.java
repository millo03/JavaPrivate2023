package Buoi_3_OOP.Bai_tap_tren_lop;

public class Bai1 {
    public static void main(String[] args) {
        Account a = new Account(1, "huyen", 100);
        a.deposit(30);
        a.display();
        a.deposit(100);
        a.display();
        a.withdraw(10);
        a.display();
        a.withdraw(300);
        System.out.println(a.getId());
    }
}
