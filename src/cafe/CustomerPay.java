package cafe;

public class CustomerPay {
    private String nickName;
    private int totalMoney;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void pay(int price) {
        System.out.println(price + "가 결제되었습니다.");
    }

    public void chargeMoney(int money) {
        System.out.println(money + "원이 충전되었습니다.");
    }

    public void checkMoney(int totalMoney) {
        System.out.println(totalMoney+"원의 잔액이 있습니다.");
    }

    public void alarmRemainMoney(int totalMoney) {
        System.out.println("현재"+totalMoney+"원으로 3천원이하의 잔액입니다.");
        System.out.println("충전이 필요합니다.");
    }
}
