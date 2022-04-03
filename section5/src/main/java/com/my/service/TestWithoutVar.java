package section5.src.main.java.com.my.service;

public class TestWithoutVar {
    public static void main(String[] args) {
        // 給一個半徑 (r = 5), 計算其圓周 => PI * 2r
        System.out.println("圓周 = " + 3.14159 * 2 * 5);
        // 給一個半徑 (r = 5), 計算其面積 => PI * r * r
        System.out.println("面積 = " + 3.14159 * 5 * 5);
        // 半徑變2倍, 計算其圓周
        System.out.println("圓周 = " + 3.14159 * 2 * (2*5));
        // 半徑變2倍, 計算其面積
        System.out.println("面積 = " + 3.14159 * (2*5) * (2*5));
    }
}
