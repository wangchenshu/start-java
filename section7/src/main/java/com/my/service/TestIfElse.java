package main.java.com.my.service;

public class TestIfElse {
    public static void main(String[] args) {
        int score = 80;  

        if (score >= 90) {
            System.out.println("You got A.");
        } else if (score >= 80) {
            System.out.println("You got B.");
        } else if (score >= 70) {
            System.out.println("You got C.");
        } else if (score >= 60) {
            System.out.println("You got D.");
        } else  {
            System.out.println("You got F.");
        }
    }    
}
