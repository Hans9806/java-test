package test.test7;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item) {
        if(count > 9) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        items[count] = item;
        count++;
    }
    public void displayItem() {
        System.out.println("장바구니 상품 출력 ");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명:"+items[i].getName()+", 합계: "+items[i].getTotal());
        }
        System.out.println("전체 가격 합: "+ calculateSum());
    }
    private long calculateSum() {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].getTotal();
        }
        return sum;
    }
}
