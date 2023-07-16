package cafe;

import java.util.List;

public class Customer {
    private String nickName;
    private int orderCount;
    private String menu;
    private String thanksComment;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getThanksComment() {
        return thanksComment;
    }

    public void setThanksComment(String thanksComment) {
        this.thanksComment = thanksComment;
    }

    public void order(List<Menu> menu) {
        System.out.println(menu.get(1) + "사이즈로" + menu.get(0) + "한 잔" + menu.get(3) + "로 주세요.");
    }

    public void payment(int price) {
        System.out.println(price);
    }

    public String pickUp() {
        return thanksComment;
    }
}
