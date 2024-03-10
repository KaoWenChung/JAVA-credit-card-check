package com.example.creditcardcheck;

public class LuhnAlgoImpl {
    public boolean check(int[] cardNumbers) {
//        int[] reversedArray = reversedArray
        System.out.println(cardNumbers);
        return true;
    }
}


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