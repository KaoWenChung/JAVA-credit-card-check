package com.example.creditcardcheck;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LuhnAlgoImplTests {

    @Test
    void testLuhnAlgo_ValidCardNumbers5545612808860939_true() {
        // given
        LuhnAlgoImpl luhnAlgoImpl = new LuhnAlgoImpl();
        long validCardNumbers = 5545612808860939L;

        // when
        boolean result = luhnAlgoImpl.check(validCardNumbers);

        // then
        assertTrue(result);
    }

    @Test
    void testLuhnAlgo_ValidCardNumbers5545612808860949_false() {
        // given
        LuhnAlgoImpl luhnAlgoImpl = new LuhnAlgoImpl();
        long validCardNumbers = 5545612808860949L;

        // when
        boolean result = luhnAlgoImpl.check(validCardNumbers);

        // then
        assertFalse(result);
    }
}