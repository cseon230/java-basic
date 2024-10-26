package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder po1 = new ProductOrder();
        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 3000;
        po2.quantity = 3;

        int sum = 0;

        ProductOrder[] productOrders = {po1, po2};

        for (ProductOrder po : productOrders) {
            sum += po.price * po.quantity;
        }

        System.out.println("총액 : " + sum);
    }
}
