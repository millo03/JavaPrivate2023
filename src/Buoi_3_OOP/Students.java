package Buoi_3_OOP;

import java.util.Scanner;

public class Students {
    // thuộc tính (attribute)
    // ko khái báo mặc định default
    private String id;
    private String name;
    private String points;
    //hằng
    private final String ID = "0";

    // phương thức(Method): thực hiện hành động của đối tượng

    // Constructor: Access modifier bắt buộc: public, NameConstructor trùng với NameClass

    public Students() {
    }// ko có tham số

    // Con trỏ This: cho phép truy cập đến thuộc tính phương thức của đối tượng đang nói, lơp đang thực thi
    //  - phân biệt thuộc tính của lớp
    public Students(String id, String name, String points) {// có tham số
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public Students(Students a) {// gán lại sinh viên khác
        this.id = a.id;
        this.name = a.name;
        this.points = a.points;
    }

    // Getter: Lấy giá trị thuộc tính
    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPoints() {
        return this.points;
    }
    //Setter: Thay đổi giá trị thuộc tính

    //    public void setID(String id){// thường ko cho sửa id
//        this.id = id;
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(String points) {
        this.points = points;
    }
//    public Students setID1(String id){ // trả về đối tượng
//        this.id = id;
//        return this;
//    }

    void GoToStudy() {
        System.out.println("Đi học");
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
    }

    void display() {
        System.out.println("Id: " + id + "     Name: " + this.name + "       Point: " + this.points);
    }

}
