package cafe;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        int totalAmount = customer.chargeMoney(100000);
        System.out.println("현재 총 잔액 : " + totalAmount + "원");

        customer.orderCoffee("Tall", "아메리카노", "아이스");

        int pay = customer.pay(4500);
        System.out.println("결제 완료되었습니다. 현재" + pay + "원 잔액이 있습니다.");

        Barista barista = new Barista();

        //Customer 클래스에서 커피를 주문(orderCoffee())한 후, Menu객체를 가져와서 Barista에 넘겨준다.
//        Menu menu = customer.getMenu();
//        barista.giveCoffee(1,"쏭쏭", menu);
        PickUpTable pickUpTable = new PickUpTable();
        Menu menu = new Menu();
        pickUpTable.baristaSay(customer, menu);

        /**
         Menu클래스를 Customer클래스에서 필드로 받아서 활용했는데..
         이게 객체합성이겠지. Menu 자체 음.. 특정 기능을 사용하고 싶은거니까? 분류를 위해 사용하는 건 아니니까.
         무튼 객체 합성을 활용해서 Customer가 주문한 커피명을 Barista가 부를 수 있다.

         Menu 클래스가 있다.
         Customer 클래스에서 Menu객체 자체를 필드로 받아서 Menu menu , 해당 Menu 클래스의 필드들에 필요한 값을 세팅해준다.

         Barista 클래스에서 giveCoffee 메서드에서 Menu menu로 객체 자체를 매개변수로 받는다.
         그럼 Menu에는 이미 Customer 클래스에 의해 셋팅되어 있는 값이 있고, 그 값들을 사용할 수 있다.

         Main 클래스에서도 Customer 클래스에서 셋팅된 Menu 클래스의 필드를 호출하면 셋팅되어있는 원하는 값을 불러올 수 있다.
         */

//        customer.pickupCoffee();
        pickUpTable.customerSay();
    }
}