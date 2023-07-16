package cafe;

import java.util.List;

public class Barista {
    private int orderCount;
    private List<Menu> menu;

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public void getOrder(String menu) {
        System.out.println("네, 고객님. " + menu + "준비해드리겠습니다.");
    }

    public void payment(int money) {
        System.out.println(money + "원 결제하겠습니다.");
    }

    public void serveCoffee(int orderCount, String menu) {
        System.out.println(menu+ orderCount + "잔 드리겠습니다.");
    }
}
