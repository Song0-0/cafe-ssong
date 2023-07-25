package cafe;

import cafe.Barista;
import cafe.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        int totalAmount = customer.chargeMoney(100000);
        System.out.println("현재 총 잔액 : " + totalAmount + "원");

        customer.orderCoffee("Tall", "아메리카노", "아이스");

        int pay = customer.pay(4500);
        System.out.println("결제 완료되었습니다. 현재" + pay + "원 잔액이 있습니다.");

        Barista barista = new Barista();
        barista.giveCoffee(1,"쏭쏭");

    }
}