package baitapthem1.controller;

import baitapthem1.service.ITeacherService;
import baitapthem1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static ITeacherService teacherService = new TeacherService();
    private static Scanner sc = new Scanner(System.in);
    public static void menuTeacher(){
        while (true){
            System.out.println("1.Thêm mới giảng viên:");
            System.out.println("2.Xóa giảng viên:");
            System.out.println("3.Xem danh sách giảng viên:");
            System.out.println("4.Quay lại:");
            System.out.print("Mời nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    teacherService.addTeacher();
                    break;
                case 2:
                    teacherService.removeTeacher();
                    break;
                case 3:
                    teacherService.getAll();
                    break;
                case 4:
                    return;
            }
        }
    }
}
