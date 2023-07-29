package cafe;

public class PickUpTable {
    private int coffee;

    public void notPickUp() {
        ++coffee;
        System.out.println("픽업테이블 커피 개수 확인용 : " + coffee);
    }

    public void pickedUp() {
        --coffee;
        System.out.println("픽업테이블 커피 개수 확인용 : " + coffee);
    }
}
