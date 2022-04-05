package main.java.com.my.service;

public class TestTernaryOperator {
    public static void main(String[] args) {
        int score = 90;

        // 使用三元運算子
        String grade = (score >= 90) ? "B" : "F";
        System.out.println("You got " + grade);

        // // 使用 if 選擇結構
        // if (score >= 90) {
        //     grade = "B";
        // } else {
        //     grade = "F";
        // }
        // System.out.println("You got " + grade);
    }
}
