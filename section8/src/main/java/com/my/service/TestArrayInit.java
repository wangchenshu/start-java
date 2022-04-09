package main.java.com.my.service;

import java.util.Arrays;

public class TestArrayInit {
    public static void main(String[] args) {
        // 宣告 (Declaring)
        int[] ints;

        // 建構實例 (Instantiating)
        ints = new int[5];

        // 初使化 (Initializing)
        ints[0] = 0;
        ints[1] = 2;
        ints[2] = 4;
        ints[3] = 8;
        ints[4] = 6;

        // 宣告, 實例化及初使化, 一起完成        
        int[] nums = {1, 3, 5, 7, 9};
        String[] strings = {"Hi", "I", "am", "Chance"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));
    } 
}
