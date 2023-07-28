package cafe;

public class PickUpTable {
    private int coffee;

    public void baristaSay(Customer customer, Menu menu) {
        ++coffee;
        System.out.println("픽업테이블 커피 개수 확인용 : " + coffee);
        System.out.println(customer.getNickname() + "고객님 주문하신 " + menu.getName() + " 한 잔 나왔습니다.");
    }

    public void customerSay() {
        --coffee;
        System.out.println("픽업테이블 커피 개수 확인용 : " + coffee);
        System.out.println("감사합니다.");
    }
}
