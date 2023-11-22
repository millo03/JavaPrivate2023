package Buoi5.BTVN.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassRoom {
    static ArrayList<Student2> ArrS= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void join(){
        Student2 a= new Student2();
        a.input(sc);
        if(a.getId() == 555) return;
        else ArrS.add(a);
    }
    public static void title (){
        System.out.printf("%-7s%-17s%-10s%-10s%-10s%-10s%-17s%-10s%-10s\n","ID","Name","Age","","Address","","  Name Class","GPA","Check Fall");
    }
    public static void output(){
        title();
//        for(Student2 a: ArrS){
//            a.output();
//        }
        // bieu thu lamda
        if(ArrS.isEmpty()) System.out.println("Líst is empty");
        else ArrS.forEach(i-> i.output());
    }
    // sort
    public static void sortByGPA(){
        Collections.sort(ArrS,(stu1,stu2)->Double.compare(stu1.getGpa(), stu2.getGpa()));
        System.out.println("Complete arrangment.");
    }
    // xoa theo id
    public static boolean removeById(){
        int flag=0;
        if(ArrS.isEmpty()) System.out.println("List is empty, you can't remove object");
        else{
            int id;
            System.out.print("You want to remove by id: ");
            id = sc.nextInt();
            for(Student2 i: ArrS){
                if(i.getId()== id) {
                    ArrS.remove(i);
                    flag =1;
                }
            }
        }
        if(flag == 1 ) return true;
        else return false;
    }
    public static int check(){
        int choose;
        System.out.print("Your choose: ");
        choose= sc.nextInt();
        sc.nextLine();
        while (0 >= choose || choose >5  ){
            System.out.print("Your choose: ");
            choose= sc.nextInt();
            sc.nextLine();
        }
        return choose;
    }

    public static void main(String[] args) {
        System.out.println("==============MENU===============");
        System.out.println("1. Add new student");
        System.out.println("2. Display");
        System.out.println("3.Sort by GPA");
        System.out.println("4. Remove by id");
        System.out.println("5. Exits");
        do{
            switch (check()){
                case 1:
                    join();
                    break;
                case 2:
                   output();
                   break;
                case 3:
                    sortByGPA();
                    break;
                case 4:
                    if(!removeById()) System.out.println("List is empty");
                    else System.out.println("Complete deletion");
                    break;
                case 5:
                    System.out.println("Exit!");
                    return;
            }

        }while (true);
    }
}
