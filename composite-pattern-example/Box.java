import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
  private List<Product> products = new ArrayList<Product>();

  public Box(List<Product> products) {
    this.products = products;
  }

  @Override
  public Double calculatePrice() {
    return 0.0;
  }

  public void addProduct(Product p) {
    this.products.add(p);
  }

  public void removeProduct(Product p) {
    this.products.remove(p);
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
