public interface Order {
    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}

public interface InvoiceService {
    void generateInvoice(String fileName);
}

public interface NotificationService {
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
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}

public class InvoiceGenerator implements InvoiceService {

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}

public class EmailNotification implements NotificationService {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}

public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        InvoiceService invoiceService = new InvoiceGenerator();
        invoiceService.generateInvoice("order_123.pdf");

        NotificationService notificationService = new EmailNotification();
        notificationService.sendEmailNotification("johndoe@example.com");
    }
}
