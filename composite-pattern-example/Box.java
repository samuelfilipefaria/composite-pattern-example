import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
  private List content = new ArrayList();

  public Box(List content) {
    this.content = content;
  }

  @Override
  public Double calculatePrice() {
    Double amount = 0.0;

    for(int i = 0; i < content.size(); i++) {
      if (content.get(i) instanceof Product) {
        Product product = (Product) content.get(i);
        amount += product.calculatePrice();
      } else {
        Box box = (Box) content.get(i);
        amount += box.calculatePrice();
      }
    }

    return amount;
  }

  public void addProduct(Product p) {
    this.content.add(p);
  }

  public void removeProduct(Product p) {
    this.content.remove(p);
  }

  public void addBox(Box b) {
    this.content.add(b);
  }

  public void removeBox(Box b) {
    this.content.remove(b);
  }

  public List getContent() {
    return this.content;
  }

  public void setContent(List content) {
    this.content = content;
  }
}
