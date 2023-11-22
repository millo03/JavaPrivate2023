package Buoi5;

import java.util.ArrayList;

public class LT {
    //              Collection(1 interface)      Map             Iterator
    //              /      |        \             |                  |
    //          List     Set        Queue       SortMap          Lislterator
    //                     |          \
    //                  SortSet     Deque
    // mảng
    public static void main(String[] args) {
        /**==============ARRAYLIST======================
         * - được triển khai từ lớp list
         * - thuộc thư viện util,
         * - thêm phần tử NameArray.add(index,element), depends on 0 <= index < size
           - addAll thêm mảng này vào mảng khác
           - array1.retainAll(array2) remove element of array1 if it hasn't array2
           - indexOf, lastIndexOf: return index of search element, if don't find element, return -1
         * array1.set(index, value): update value at index in array1
         - array1.get(index) return value at index in array1
         * array1.isEmtry()
         */
        ArrayList<Integer> students = new ArrayList<>();// java 8 don't need object in <>
        students.add(1);
        students.add(3);
        students.add(1,2);
        //students.add(5,5);// ko thêm được vì Index 5 size 3: vượt quá số phần tử mảng
        ArrayList<Integer> students2 = new ArrayList<>();// java 8 don't need object in <>
        students2.add(4);
        students2.add(5);
        students.addAll(students2);// add element of array students2 for array student

        for (Integer a: students ) {
            System.out.println(a+"      ");
        }
        // Lamda
        students.forEach( i -> System.out.println(i));// Display Array Student
        students2.forEach(integer -> System.out.print(integer+ "   " ));
        /*
         * Arr1.get(0) = 2;
         * Arr1.set(0,7) lúc này giá trị 2 bị hủy thay vào là 7
         *
         * */

        //==============KẾ THỪA TRONG JAVA: Inheritance ====================
        /** key extend
         * Chỉ được kế thừa 1 lớp
         * kế thừa để tái sử dụng code
         * dễ chỉnh sửa lỗi, tăng khải năng mở rộng
         * mặc định lớp kế thừa của Object khi có r thì nó sẽ hủy
         */
        //===========OVERRIDE==================
        /**
         * thường dùng ghi dè method của cha
         */
    }

}
