package Buoi5.BTVN.Bai2;

public class Person2 {
    protected String name;
    protected String numCount;
    protected String address;

    public Person2() {
    }

    public Person2(String name, String numCount, String address) {
        this.name = name;
        this.numCount = numCount;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumCount() {
        return numCount;
    }

    public void setNumCount(String numCount) {
        this.numCount = numCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
