package test.test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("주문 갯수를 입력하세요: ");
        int orderNumber = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[orderNumber];

        for (int i = 0; i < orderNumber; i++) {
            System.out.println((i+1) + "번째 주문을 입력해주세요.");

            System.out.println("상품명: ");
            String productName = scanner.next();
            System.out.println("가격: ");
            int price = scanner.nextInt();
            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity);
        }
        printOrder(orders);

        int totalPayment = getTotalPayment(orders);
        System.out.println("총 결제금액 : "+totalPayment+"원");
    }

    private static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.print("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity+"\n");
        }
    }
    private static int getTotalPayment(ProductOrder[] orders) {
        int totalPayment = 0;
        for (ProductOrder order : orders) {
            totalPayment += order.price * order.quantity;
        }
        return totalPayment;
    }
    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
}
