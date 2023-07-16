package cafe;

public class PickUpTable {

    private String nickName;
    private int coffeeCount;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }

    public void checkCount(int coffeeCount) {
        System.out.println("픽업테이블에 놓인 커피가" + coffeeCount + "개 있습니다.");
    }

    public void alarmCustomer(String nickName, String menu) {
        System.out.println(nickName + "고객님 주문하신 " + menu + "한 잔 나왔습니다.");
    }
}
