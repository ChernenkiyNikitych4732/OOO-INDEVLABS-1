package com.chernenkiy.ooo_indevlabs_technical_assesment_java;

public class FindMissingNumber { // The name of the class;

    /**
     * Steps to solve the technical assessment java.
     * 1) Calculate the array using the formula m(m+i) / 2, and find the missing number in the array. Example: Input [5, 0, 1, 1, 3, 2], Output: 4
     * 2) Calculate the array using the formula m(m+i) / 2, and find the missing number in the array. Example: Input [7, 9, 10, 11, 12], Output: 8
     * 3) Write a formula for the calculation, and find the missing numbers in the first and second arrays.
     * 4) Calculate the expected sum of the arithmetic progression.
     * 5) Return the missing number in the array.
     * 6) Write basic methods for testing
     * 7) Add JUnit tests for testing.
     */

    // Write a formula to calculate and find the missing numbers in the first and second arrays, based on the numbers we knew in the example;
    // 5,1,3,2 numbers in the first array;
    // 1+2=3; 3+3=6; 6+4=10; 10+5=15 add up the numbers that were in the first array;
    // S=5(5+1) / 2 = 5*6 / 2 = 15 Formula for calculating and finding the missing number in the first array;
    // 1+2=3; 3+3=6; 6+5=11 Once again add the numbers of the first array;
    // 15-11=4 Found the missing number in the first array;
    // 7,9,10,11,12 numbers in the second array;
    // 7+9=16, 16+10=26, 26+11=37; 37+12=49 add the numbers of the second array;
    // S=6 (7+12) / 2 = 6 * 19 / 2 = 57 Formula for calculating and finding the missing number in the second array;
    // 7+9=16; 16+10=26; 26+11=37; 37+12=49 Once again add the numbers of the second array;
    // 57-49=8 Found the missing number in the second array;


    public static void main(String[] args) {
        int[] num = {5,0,1,3,2}; // Numbers of array No. 1;
        int[] num1 = {7,9,10,11,12}; // Numbers of array No. 2;
        int n1 = FindMissingNumber(num, 1, 5); // Looking forward to find the missing numbers of array № 1;
        int n2 = FindMissingNumber(num1, 7, 12); // Looking forward to find the missing numbers of array № 2
        System.out.println("Missing number in the first array: " + n1); // Get the missing number of array  № 1;
        System.out.println("Missing number in the second array: " + n2); //  Get the missing number of array  № 2;
    }

    public static int FindMissingNumber(int[] num, int start, int end) {
        int expectedSum = (end * (end + 1)) / 2 - ((start - 1) * start) / 2; // Calculation of the expected sum of arithmetic progression;
        int actualSum = 0;
        for (int i : num) {
            actualSum += i;
        }
        return expectedSum - actualSum; // Returning the missing numbers in the first and second arrays;
    }
}

