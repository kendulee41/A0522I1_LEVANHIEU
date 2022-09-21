package ss12_javaCollection.excercise.controller;

import ss12_javaCollection.excercise.service.IProductService;
import ss12_javaCollection.excercise.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    private static IProductService iProductService = new ProductService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Thêm sản phẩm:");
            System.out.println("2.Sửa thông tin sản phẩm theo id:");
            System.out.println("3.Xoá sản phẩm theo id:");
            System.out.println("4.Hiển thị danh sách sản phẩm:");
            System.out.println("5.Tìm kiếm sản phẩm theo tên:");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá:");
            System.out.println("7.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addNew();
                    break;
                case 2:
                    iProductService.get();
                    break;
                case 3:
                    iProductService.remove();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.search();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("////////Nhập sai chức năng////////");

            }
        }
    }
}
