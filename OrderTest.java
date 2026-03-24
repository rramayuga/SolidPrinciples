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