package com.debug;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,87};
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += i;
            System.out.println(sum);

        }
    }
}
