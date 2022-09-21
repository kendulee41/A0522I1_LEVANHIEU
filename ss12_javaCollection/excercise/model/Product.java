package ss12_javaCollection.excercise.model;

import java.util.Objects;

public class Product{
    private String iD;
    private String name;
    private int price;
    private int amount;

    public Product(String iD, String name, int price, int amount) {
        this.iD = iD;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product() {
    }

    public Product(String iD) {
        this.iD = iD;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(byte price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + " nghìn VNĐ" +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(iD, product.iD);
    }

}
