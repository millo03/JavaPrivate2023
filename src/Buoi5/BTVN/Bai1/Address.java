package Buoi5.BTVN.Bai1;

import java.util.Scanner;

public class Address {
    private String commune;// xã
    private String district;
    private String city;

    public Address() {
        commune = "" ;
        district = "" ;
        city = "" ;
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void input(Scanner sc){
        System.out.print("Commune: ");
        setCommune(sc.nextLine());
        System.out.print("District: ");
        setDistrict(sc.nextLine());
        System.out.print("City: ");
        setCity(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-1s%s,%s,%-15s","",commune,district,city);
    }

}
