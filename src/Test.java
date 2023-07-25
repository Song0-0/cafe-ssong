public class Test {
    //return을 왜쓰냐?
    public static void main(String[] args) {

        System.out.println(add(1,4));
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // 합을 반환
    }
}
