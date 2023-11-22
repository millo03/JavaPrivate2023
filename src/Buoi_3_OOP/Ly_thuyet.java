package Buoi_3_OOP;

public class Ly_thuyet {
    public static void main(String[] args) {
        // Java là ngôn ngữ hướng đối tượng
        // 1 lớp có 2 thành phần chính
        /*  - Thuộc tính: tên, tuổi,...
            - Method
        * Package:
        - tương tự như folder( both folder)
        * Phạm vi truy câp (access modifier)
        Access modifier    | Bên trong lớp | Bên trong package| Bên trong lớp con | Bên ngoài package |
            private        |     C         |      K           |       K           |           K       |
            default        |     C         |      C           |       K           |           K       |
            protected      |     C         |      C           |       C           |           K       |
            public         |     C         |      C           |       C           |           C       |
        *
        *
        * */
        Students a = new Students("1", "Huyen", "10");
        // a là thể hiện(instance), ("1","Huyen","10") là đối tượng(đối tượng)
        // có nhiều instance trỏ đến 1 đối tượng,
        Students b = new Students(a);// gán Student b = a;
        a.GoToStudy();
        a.display();
        b.GoToStudy();
        b.display();
        System.out.println(" b có id = " + b.getID());

        b.display();

        //System.out.println("hello");
    }
}
