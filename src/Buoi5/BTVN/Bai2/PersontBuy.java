package Buoi5.BTVN.Bai2;

import java.util.Scanner;

public class PersontBuy extends Person2{
    private String taxCode;// mã thuế
    private String phone;

    public PersontBuy() {
    }

    public PersontBuy(String name, String numCount, String address, String taxCode, String phone) {
        super(name, numCount, address);
        this.taxCode = taxCode;
        this.phone = phone;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input(Scanner sc){
        setName((sc.nextLine()));
        setTaxCode(sc.nextLine());
        setAddress(sc.nextLine());
        setNumCount(sc.nextLine());
        setPhone(sc.nextLine());
    }

    public void output() {
        System.out.println("Tên người bán: "+name);
        System.out.println("Mã số thuế: "+taxCode);
        System.out.println("Địa chỉ: "+ address);
        System.out.println("Số tài khoản"+ numCount);
        System.out.println("Điện thoại"+ phone);
    }
}
