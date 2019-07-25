package com.stackroute.pe3;

public class ConsecutiveNumbers {

    public String checkConsectiveNumbers(int[] input) {
        String result = "";
        int temp;
        int i;
        int j;
        for (i = 0; i < input.length; i++) {
            for (j = i + 1; j < input.length; j++) {
                if (input[i] >= input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
                if (input[i+1] - input[i] == 1) {
                    result = "The numbers are Consecutive";
                } else {
                    result = "The numbers are not Consecutive";
                }
            }
        }
        return result;
    }
}

