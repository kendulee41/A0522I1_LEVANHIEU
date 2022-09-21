package baitapthem1.controller;

import baitapthem1.service.IStudentService;
import baitapthem1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    private static Scanner sc = new Scanner(System.in);
    public static void menuStudent(){
        while (true){
            System.out.println("1.Thêm mới học sinh:");
            System.out.println("2.Xóa học sinh:");
            System.out.println("3.Xem danh sách học sinh:");
            System.out.println("4.Quay lại:");
            System.out.print("Mời nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
                    studentService.getAll();
                    break;
                case 4:
                    return;
            }
        }
    }
}
