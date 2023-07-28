package cafe;

public class Customer {
    private int payTotalAmount;
    private String nickname;
    private Menu menu;

    //이 초기화를 안하면 nullPointerExcetion이 발생한다.
    //기본 생서자는 그냥 생기는데 왜 생성자를 만든것이지?
    //생성자에서 Menu 객체를 초기화한다.
    public Customer() {
        menu = new Menu();
    }

    Menu getMenu() {
        return menu;
    }

    String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int chargeMoney(int money) {
        payTotalAmount += money;
        return payTotalAmount;
    }

    public void orderCoffee(String size, String name, String temperature) {
        menu.setSize(size);
        menu.setName(name);
        menu.setTemperature(temperature);
        System.out.println(menu.getSize() + "사이즈 " + menu.getName() + " 한 잔 " + menu.getTemperature() + "로 주세요");
    }

    public int pay(int orderAmount) {
        payTotalAmount -= orderAmount;

        if (payTotalAmount < orderAmount) {
            System.out.println("잔액이 부족하여 결제가 불가합니다. 충전 후 결제부탁드립니다.");
        }

        if (payTotalAmount <= 3000) {
            System.out.println("결제가 완료되었습니다. 결제 후 잔액은" + payTotalAmount + "원으로 충전이 필요합니다.");
        }

        return payTotalAmount;
    }

    public void pickupCoffee(PickUpTable pickUpTable) {

//        Barista barista = new Barista();
//        barista.setPickupTableCoffee(0);

//        System.out.println("감사합니다.");
//        System.out.println("(픽업테이블 : "+barista.getPickupTableCoffee()+"개의 커피가 있습니다.)");

        pickUpTable.customerSay();

    }


}
