package com.example.creditcardcheck;

// *Starting from the rightmost digit (the check digit) and moving left,
// double the value of every second digit.
// If the result of this doubling operation is greater than 9,
// subtract 9 from the result.
//
// Sum all the individual digits obtained from
// the doubling operation and those that were not doubled.
//
// If the total sum is divisible by 10
// (i.e., the modulo 10 result is 0),
// then the number is valid according to the Luhn algorithm.

public class LuhnAlgoImpl {
    public static boolean check(long cardNumbers) {
        String cardNumberString = String.valueOf(cardNumbers);
        int[] cardNumberArray = new int[cardNumberString.length()];

        for (int i = 0; i < cardNumberString.length(); i++) {
            cardNumberArray[i] = Character.getNumericValue(cardNumberString.charAt(i));
        }

        int[] reversedArray = new int[cardNumberArray.length];
        for (int i = 0, j = cardNumberArray.length - 1; i < cardNumberArray.length; i++, j--) {
            reversedArray[i] = cardNumberArray[j];
        }

        int[] doubledEverySecondArray = new int[reversedArray.length];
        for (int i = 0; i < reversedArray.length; i++) {
            int value = reversedArray[i];
            int newValue = value;
            if ((i + 1) % 2 == 0) {
                newValue *= 2;
                if (newValue > 9) {
                    newValue -= 9;
                }
            }
            doubledEverySecondArray[i] = newValue;
        }

        int sum = 0;
        for (int value : doubledEverySecondArray) {
            sum += value;
        }

        return sum % 10 == 0;
    }
}

