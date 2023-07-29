package cafe;

public class Barista {

    public void giveCoffee(Customer customer, PickUpTable pickUpTable) {
        System.out.println(customer.getNickname() + "고객님 주문하신 " + customer.getMenu().getName() + " 한 잔 나왔습니다.");
        pickUpTable.notPickUp();
    }
}
