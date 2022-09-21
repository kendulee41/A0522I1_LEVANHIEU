package baitapthem1.service.impl;

import baitapthem1.model.Student;
import baitapthem1.repository.IStudentRepository;
import baitapthem1.repository.impl.StudentRepository;
import baitapthem1.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public void addStudent() {
        System.out.println("Nhập mã học sinh:");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên học sinh:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh học sinh:");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính học sinh:");
        String gender = sc.nextLine();
        System.out.println("Nhập lớp học sinh:");
        String className = sc.nextLine();
        System.out.println("Nhập điểm học sinh:");
        double point = Double.parseDouble(sc.nextLine());
        Student student1 = new Student(code,name,dayOfBirth,gender,className,point);
        studentRepository.addStudent(student1);
    }

    @Override
    public void removeStudent() {
        studentRepository.removeStudent();
    }

    @Override
    public void getAll() {
        studentRepository.getAll();
    }
}
