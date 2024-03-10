package com.example.creditcardcheck.extension;

public class IntArrayExtension {
    public static int[] reversedArray(int[] array) {
        int length = array.length;
        int[] result = new int[length];

        for(int i = 0; i < length; i++) {
            result[i] = array[length - 1 - i];
        }

        return result;
    }
}
