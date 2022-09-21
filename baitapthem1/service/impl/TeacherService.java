package baitapthem1.service.impl;

import baitapthem1.model.Student;
import baitapthem1.model.Teacher;
import baitapthem1.repository.ITeacherRepository;
import baitapthem1.repository.impl.TeacherRepository;
import baitapthem1.service.ITeacherService;

import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner sc = new Scanner(System.in);
    private ITeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void addTeacher() {
        System.out.println("Nhập mã giảng viên:");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên giảng viên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh giảng viên:");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính giảng viên:");
        String gender = sc.nextLine();
        System.out.println("Nhập chuyên môn giảng viên:");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(code,name,dayOfBirth,gender,specialize);
        teacherRepository.addTeacher(teacher);
    }

    @Override
    public void removeTeacher() {
        teacherRepository.removeTeacher();
    }

    @Override
    public void getAll() {
        teacherRepository.getAll();
    }
}
