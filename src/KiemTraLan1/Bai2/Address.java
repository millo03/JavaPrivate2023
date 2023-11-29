package KiemTraLan1.Bai2;

import java.util.Scanner;

public class Address {
    private String distric;
    private String city;

    public Address(String distric, String city) {
        this.distric = distric;
        this.city = city;
    }
    public Address() {
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tinh:");
        distric =scanner.nextLine();
        System.out.println("Nhap thanh pho:");
        city= scanner.nextLine();
    }
    @Override
    public String toString() {
        return distric+"          "+city+"         ";
    }

}
