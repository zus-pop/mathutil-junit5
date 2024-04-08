package com.zus.mathutil.core;

import static com.zus.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author hoang
 */
public class MathUtilTest {
    
    public static Object[][] initData() {
        return new Integer[][] {
                                                {1, 1},
                                                {2, 2},
                                                {5, 120},
                                                {6, 120}
                                            };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactGivenRightArgumentReturnsWell(int input, long expected) {
        assertEquals(expected,getFactorial(input));
    }
    
//    @Test
//    public void testGetFactGivenRightArgumentReturnsWell() {
//        assertEquals(24,getFactorial(4));
//    }
    
    @Test
    public void testGetFactGivenWrongArgumentThrowException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-1));
    }
}
