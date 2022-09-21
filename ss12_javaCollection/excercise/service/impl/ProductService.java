package ss12_javaCollection.excercise.service.impl;

import ss12_javaCollection.excercise.model.Product;
import ss12_javaCollection.excercise.repository.IProductRepository;
import ss12_javaCollection.excercise.repository.impl.ProductRepository;
import ss12_javaCollection.excercise.service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.println("Nhập id:");
        String id = sc.nextLine();
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập giá(đơn vị: nghìn đồng):");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng:");
        int amount = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price, amount);
        iProductRepository.addNew(product);
    }

    @Override
    public void get() {
        System.out.println("Nhập id sản phẩm muốn sửa:");
        String id = sc.nextLine();
        iProductRepository.get(id);
    }

    @Override
    public void remove() {
        System.out.println("Nhập id sản phẩm muốn xóa:");
        String id = sc.nextLine();
        iProductRepository.remove(id);
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm muốn tìm:");
        String name = sc.nextLine();
        iProductRepository.search(name);
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    @Override
    public void sort() {
        System.out.println("Chọn:");
        System.out.println("1.Giá tăng dần.");
        System.out.println("1.Giá giảm dần.");
        int choice = Integer.parseInt(sc.nextLine());
        iProductRepository.sort(choice);
    }
}
