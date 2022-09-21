package ss12_javaCollection.excercise.repository.impl;

import ss12_javaCollection.excercise.model.Product;
import ss12_javaCollection.excercise.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product("A1", "giấy vệ sinh", 5, 100));
        productList.add(new Product("A3", "bàn là", 200, 50));
        productList.add(new Product("A2", "xúc xích gói", 12, 102));
    }

    @Override
    public void addNew(Product product) {
        productList.add(product);
        System.out.println("Thêm thành công");
    }

    @Override
    public void get(String idCheck) {
        int index = productList.indexOf(new Product(idCheck));
        if (index != -1) {
            System.out.println("Nhập id:");
            String id = sc.nextLine();
            System.out.println("Nhập tên:");
            String name = sc.nextLine();
            System.out.println("Nhập giá(đơn vị: nghìn đồng):");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng:");
            int amount = Integer.parseInt(sc.nextLine());
            Product product = new Product(id, name, price, amount);
            productList.set(index, product);
        } else {
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void remove(String idRemove) {
        int index = productList.indexOf(new Product(idRemove));
        if (index != -1) {
            productList.remove(index);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy id");
        }
    }


    @Override
    public void search(String name) {
        boolean check=false;
        for (Product product : productList) {
            if (product.getName().equals(name)){
                System.out.println(product);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy tên");
        }
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sort(int choice) {
        if (choice==1){
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice() >= o2.getPrice()){
                        return 1;
                    }else {
                        return -1;
                    }
                }
            });
        }else if (choice ==2){
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice() >= o2.getPrice()){
                        return -1;
                    }else {
                        return 1;
                    }
                }
            });
        }else {
            System.out.println("Nháp sai chức năng");
            return;
        }
        this.display();
    }
}
