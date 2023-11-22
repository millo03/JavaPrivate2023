package Buoi5.BTVN.Bai2;

import java.util.Scanner;

public class Products {
    private int id;
    private String name;
    private String unit; // đơn vị tính
    private int quantity;
    private float price;
    private static int ID =0;

    public Products() {
        ID = ID+1;
        this.id = ID;
        this.name = "";
        this.unit = "";
        this.quantity = 0;
        this.price = 0;
    }

    public Products(String name, String unit, int quantity, float price) {
        ID = ID+1;
        this.id = ID;
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float sum(){
        return quantity*price;
    }
    public void input(Scanner sc){
        setName(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-5d%-15s%-10s%-10d%-10f%-10f",id,name,unit,quantity,price,sum());
    }


}
