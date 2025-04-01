# SolidPrinciples

Improve the following codes to implement SOLID principles in OOP.


public interface Order {

  void calculateTotal(double price, int quantity);

  void placeOrder(String customerName, String address);

  void generateInvoice(String fileName);

  void sendEmailNotification(String email);
}

public class OrderAction implements Order {

  @Override
  public void calculateTotal(double price, int quantity) {
    double total = price * quantity;
    System.out.println("Order total: $" + total);
  }

  @Override
  public void placeOrder(String customerName, String address) {
    // Simulate placing order in a system
    System.out.println("Order placed for " + customerName + " at " + address);
  }

  @Override
  public void generateInvoice(String fileName) {
    // Simulate generating invoice file
    System.out.println("Invoice generated: " + fileName);
  }

  @Override
  public void sendEmailNotification(String email) {
    // Simulate sending email notification
    System.out.println("Email notification sent to: " + email);
  }
}

public class OrderTest {

  public static void main(String[] args) {
    Order order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    // These methods might not be needed for all orders
    order.generateInvoice("order_123.pdf");
    order.sendEmailNotification("johndoe@example.com");
  }
}


![nPEnJiCm48PtItu7Zq5KUO08eJ8Wn5A6TgiO3kSIMNBiSZvNGeLtnqsQDiHT40DPBDd_VVxlFsSP68XZPwKmZf4QqAXUg4PI1obK-cwL1gkZ1SQDPx35Zep6IjK-lbbSgFS8ZWr_L2e1RiQQdKsWdbFe6DXtI2leKjcQoRXseQ2k2KCODrBXbnHJ4yzkxzD5QwHzMYvkMdH8oSpfl6YCnI](https://github.com/user-attachments/assets/587ed9e4-e0b7-4d10-9f9c-535a3cdb84c0)
