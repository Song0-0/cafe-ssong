package cafe;

public class Barista {
    private int pickupTableCoffee;

    int getPickupTableCoffee() {
        return pickupTableCoffee;
    }

    void setPickupTableCoffee(int pickupTableCoffee) {
        this.pickupTableCoffee = pickupTableCoffee;
    }

    public int giveCoffee(int pickupTableCoffee, String nickname, Menu menu) {
        this.pickupTableCoffee += pickupTableCoffee;

        Customer customer = new Customer();
        customer.setNickname(nickname);

        System.out.println(customer.getNickname() + "고객님 주문하신 " + menu.getName() + " 한 잔 나왔습니다.");
        System.out.println("(픽업테이블 : " + pickupTableCoffee + "개의 커피가 있습니다.)");
        return pickupTableCoffee;
    }
}
