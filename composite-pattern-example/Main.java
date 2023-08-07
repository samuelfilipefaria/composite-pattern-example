import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    System.out.println("\n\n=============================== Composite Pattern Example ===============================\n\n");

    Product product1 = new Product("Manteiga", 5.0);
    Product product2 = new Product("Arroz", 2.0);
    Product product3 = new Product("Faca", 3.0);
    Product product4 = new Product("Lápis", 3.0);
    Product product5 = new Product("Biscoito", 3.0);

    Box box1 = new Box(new ArrayList());
    Box box2 = new Box(new ArrayList());
    Box box3 = new Box(new ArrayList());

    box1.addProduct(product1);
    box2.addProduct(product2);
    box2.addProduct(product3);
    box3.addProduct(product4);
    box3.addProduct(product5);

    box2.addBox(box3);
    box1.addBox(box2);

    System.out.println(box1.calculatePrice());
  }
}
