package com.example.creditcardcheck;

import com.example.creditcardcheck.extension.IntArrayExtension;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
@SpringBootTest
public class IntArrayExtensionTests {

    @Test
    void testReversedArray_12345_54321() {
        // given
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedValue = {5, 4, 3, 2, 1};

        // when
        int[] result = IntArrayExtension.reversedArray(input);

        // then
        assertArrayEquals(expectedValue, result); // Correct order of arguments
    }
    @Test
    void testReversedArray_12_21() {
        // given
        int[] input = {1, 2};
        int[] expectedValue = {2, 1};

        // when
        int[] result = IntArrayExtension.reversedArray(input);

        // then
        assertArrayEquals(expectedValue, result); // Correct order of arguments
    }
}
