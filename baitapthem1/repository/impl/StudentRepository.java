package baitapthem1.repository.impl;

import baitapthem1.model.Person;
import baitapthem1.model.Student;
import baitapthem1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Lê Văn Hiếu"
                , "09/11/1999", "Nam", "A1", 10));
        studentList.add(new Student(2, "Nguyễn Văn A"
                , "09/10/1999", "Nam", "A1", 9));
        studentList.add(new Student(3, "Lê Văn B"
                , "09/12/1999", "Nam", "A2", 8));
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Thêm thành công");
    }

    @Override
    public void removeStudent() {
        while (true) {
            System.out.println("Nhập mã học sinh muốn xóa: ");
            int codeRemove = Integer.parseInt(sc.nextLine());
            int index = studentList.indexOf(new Student(codeRemove));
            if (index != -1) {
                System.out.println("Bạn có chắc chắn muốn xóa?\n" +
                        "1.Yes\n2.No");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    studentList.remove(index);
                    System.out.println("Xóa thành công");
                    break;
                } else {
                    break;
                }
            } else {
                System.out.println("Mã không tồn tại, vui lòng nhập lại");
            }
        }
    }

    @Override
    public void getAll() {
        studentList.sort(Person::compareTo);
        for (Student std : studentList) {
            System.out.println(std);
        }
    }
}
