package KiemTraLan1.Bai2;

public interface StudentService {
    void addStudent(Student t);
    void deleteStudent(int id);
    Student searchStuden(String name);
    void sortedStudent();
    void showAllStudent();
}
