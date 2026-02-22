import java.util.Arrays;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(0,"watch",3000);
        products[1] = new Product(1,"mobile",450000);
        products[2] = new Product(2,"ipad",35000);


        for (int i = 0; i < 3; i++) {
            display(products[i]);
        }
    }



    public static void display(Product product){
        System.out.println(product.id);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
