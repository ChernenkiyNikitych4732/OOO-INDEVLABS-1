package com.chernenkiy.ooo_indevlabs_technical_assesment_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMissingNumberTest {
    @Test
    public void testFindMissingNumber_FirstArray() {
        int num[] = {5,0,1,2,3};
        int expected = 4;
        int missingNumber = FindMissingNumber.FindMissingNumber(num, 1, 5);
        assertEquals(4, missingNumber, "Ожидается, что недостающее число в первом массиве будет 4"); // Тест №1 Массив №1 с пропущенным числом 4
    }

    @Test
    public void testMissingNumber_SecondArray() {
        int num1[] = {7,9,10,11,12};
        int expected = 8;
        int missingNumber = FindMissingNumber.FindMissingNumber(num1, 7, 12);
        assertEquals(8, missingNumber, "Ожидается, что недостающее число во втором массиве будет 8");  // Тест №2 Массив №2 с пропущенным числом 8
    }
}