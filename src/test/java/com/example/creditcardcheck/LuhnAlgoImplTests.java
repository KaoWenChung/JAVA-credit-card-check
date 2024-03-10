package com.example.creditcardcheck;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LuhnAlgoImplTests {

    @Test
    void testLuhnAlgo_ValidCardNumbers_ReturnsTrue() {
        // given
        LuhnAlgoImpl luhnAlgoImpl = new LuhnAlgoImpl();
        int[] validCardNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // when
        boolean result = luhnAlgoImpl.check(validCardNumbers);

        // then
        assertTrue(result);
//        assertFalse(result);
    }
}

/*
@Test
    public void testLuhnAlgo_ValidCardNumbers_ReturnsTrue() {
        LuhnAlgoImpl luhnAlgoImpl = new LuhnAlgoImpl();
        int[] validCardNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // Replace with valid card numbers
        boolean result = luhnAlgoImpl.luhnAlgo(validCardNumbers);
        assertTrue(result);
    }

    @Test
    public void testLuhnAlgo_InvalidCardNumbers_ReturnsFalse() {
        LuhnAlgoImpl luhnAlgoImpl = new LuhnAlgoImpl();
        int[] invalidCardNumbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // Replace with invalid card numbers
        boolean result = luhnAlgoImpl.luhnAlgo(invalidCardNumbers);
        assertFalse(result);
    }
 */