package Buoi_2_Mang;

public class Ly_thuyet {
    // ko có tham trị
    //=============HẰNG=======================
    // hằng thường để 1 class riêng
    public static final double PI = 3.14;// thường hằng ghi in hết


    //====================HÀM================
    // hàm ko trả về giá trị
    public static void display(int[] array2) {
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(array2[i] + " ");
        }
    }

    //================Static=====================
    // được gọi trực tiếp từ lớp đó ko cần gọi đối tượng
    // hàm trả về giá trị
    public static int tong(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Mảng lưu trữ tập hợp cố định
        // khai báo
        int[] array1 = new int[5];
        int[] array2 = {1, 2, 3, 4};

        // khi thêm sửa xóa sẽ tạo ra mảng khác tham chiếu tới

        // chỉ số : 0-> n-1
        // vị trí: 0->n;

        // lấy 1 phần tử trong mảng ra
        int b = array2[0];

        //duyệt mảng


        for (int x : array2) System.out.print(x + "  ");
        System.out.println();

        // Test hàm
        System.out.println(tong(5, 6));
        // ==================String==============
        // string bất biến: ko thể truy cập vào phần tử và thay đổi
        String a = "I am learning Java";
        String d = " World!";
        // nối chuỗi
        String c = a.concat(d);
        System.out.println("c = " + c);
        // tìm kiếm vị trí chuỗi con, ko tìm ra trả vị trí -1
        System.out.println("indexOf = " + a.indexOf("am l"));

        //=================Warper class đổi nguyên thủy sang đối tượng
        int war = 0;
        Integer war1 = 0;// có nhiều phương thức hơn so vối int


    }


}
