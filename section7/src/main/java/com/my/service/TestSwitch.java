package main.java.com.my.service;

public class TestSwitch {
    public static void main(String[] args) {
        int score = 90;

        switch (score / 10) {
            case 9:
                System.out.println("You got A.");
                break;
            case 8:
                System.out.println("You got B.");
                break;
            case 7:
                System.out.println("You got C.");
                break;
            case 6:
                System.out.println("You got D.");
                break;
            default:
                System.out.println("You got F.");
       }
    }
}
