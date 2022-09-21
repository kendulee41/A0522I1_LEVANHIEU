package baitapthem1.repository.impl;

import baitapthem1.model.Person;
import baitapthem1.model.Student;
import baitapthem1.model.Teacher;
import baitapthem1.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList;

    static {
        teacherList = new ArrayList<>();
        teacherList.add(new Teacher(1, "Lê Văn Hiếu"
                , "09/11/1999","Nam", "Ngoại ngữ"));
        teacherList.add(new Teacher(2, "Nguyễn Văn A"
                , "09/10/1999", "Nam","Tin văn phòng"));
        teacherList.add(new Teacher(3, "Lê Văn B"
                , "09/12/1999", "Nam", "Cấu trúc cơ sở dữ liệu"));
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
        System.out.println("Thêm thành công");
    }

    @Override
    public void removeTeacher() {
        while (true) {
            System.out.println("Nhập mã giảng viên muốn xóa: ");
            int codeRemove = Integer.parseInt(sc.nextLine());
            int index = teacherList.indexOf(new Teacher(codeRemove));
            if (index != -1) {
                System.out.println("Bạn có chắc chắn muốn xóa?\n" +
                        "1.Yes\n2.No");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    teacherList.remove(index);
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
        teacherList.sort(Person::compareTo);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
