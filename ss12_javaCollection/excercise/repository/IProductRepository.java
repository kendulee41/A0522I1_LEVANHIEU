package ss12_javaCollection.excercise.repository;

import ss12_javaCollection.excercise.model.Product;

public interface IProductRepository {
    void addNew(Product product);

    void get(String id);

    void remove(String id);

    void search(String name);

    void display();

    void sort(int choice);
}
