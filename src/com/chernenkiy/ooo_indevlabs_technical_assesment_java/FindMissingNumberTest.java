package com.chernenkiy.ooo_indevlabs_technical_assesment_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMissingNumberTest { // The name of the JUnit test class;
    @Test
    public void testFindMissingNumber_FirstArray() {
        int[] num = {5,0,1,3,2}; // the variable num has an array type declaration

        int missingNumber = FindMissingNumber.FindMissingNumber(num, 1, 5);
        assertEquals(4, missingNumber, "The missing number in the first array is expected to be 4"); // Test №1 Array №1 with missing number 4;
    }

    @Test
    public void testMissingNumber_SecondArray() {
        int[] num1 = {7,9,10,11,12}; // the variable num1 has an array type declaration
        int missingNumber = FindMissingNumber.FindMissingNumber(num1, 7, 12);
        assertEquals(8, missingNumber, "The missing number in the second array is expected to be 8"); // Test №2 Array №2 with missing number 8;
    }
}