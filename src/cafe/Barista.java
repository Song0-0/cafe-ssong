package cafe;

public class Barista {
    private int pickupTableCoffee;

    int getPickupTableCoffee() {
        return pickupTableCoffee;
    }

    void setPickupTableCoffee(int pickupTableCoffee) {
        this.pickupTableCoffee = pickupTableCoffee;
    }

    public int giveCoffee(int pickupTableCoffee, String nickname) {
        this.pickupTableCoffee += pickupTableCoffee;

        Customer customer = new Customer();
        Menu menu = new Menu();
        customer.setNickname(nickname);

        System.out.println(customer.getNickname() + "고객님 주문하신" + menu.getName() + " 한 잔 나왔습니다.");

        return pickupTableCoffee;
    }
}
