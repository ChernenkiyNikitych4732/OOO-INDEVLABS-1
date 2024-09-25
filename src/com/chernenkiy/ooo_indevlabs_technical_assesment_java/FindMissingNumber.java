package com.chernenkiy.ooo_indevlabs_technical_assesment_java;

public class FindMissingNumber { // Название класса;

    /*
      Шаги для решения технического задания.
      1) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число в массиве. Пример: Вход [5, 0, 1, 3, 2], Выход: 4
      2) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число в массиве. Пример: Вход [7, 9, 10, 11, 12], Выход: 8
      3) Написать формулу для расчета, и найти недостающие числа в первом и во втором массивах.
      4) Сделать расчет ожидаемой сумму арифметической прогрессии.
      5) Вернуть недостающее число в массиве.
      6) Написать основные методы для тестирования
      7) Добавить JUnit тесты для проверки.
     */

    /**
     * English translation
     * Steps to solve the terms of reference.
     * 1) Calculate the array using the formula m(m+i) / 2, and find the missing number in the array. Example: Input [5, 0, 1, 1, 3, 2], Output: 4
     * 2) Calculate the array using the formula m(m+i) / 2, and find the missing number in the array. Example: Input [7, 9, 10, 11, 12], Output: 8
     * 3) Write a formula for the calculation, and find the missing numbers in the first and second arrays.
     * 4) Calculate the expected sum of the arithmetic progression.
     * 5) Return the missing number in the array.
     * 6) Write basic methods for testing
     * 7) Add JUnit tests for testing.
     */

    // Пишем формулу для расчета, и поиска недостающих чисел в первом и во втором массивах, исходя из чисел, которые были нам известны в примере;

    // 5,1,3,2 числа данные в первом массиве;
    // 1+2=3; 3+3=6; 6+4=10; 10+5=15 складываем числа, которые были в первом массиве;
    // S=5(5+1) / 2 = 5*6 / 2 = 15 Формула для расчета нахождения недостающего числа в первом массиве;
    // 1+2=3; 3+3=6; 6+5=11 Еще раз складываем числа первого массива;
    // 15-11=4 Найдено недостающее число в первом массиве;
    // 7,9,10,11,12 числа данные во втором массиве;
    // 7+9=16, 16+10=26, 26+11=37; 37+12=49 складываем числа второго массива;
    // S=6 (7+12) / 2 = 6 * 19 / 2 = 57 Формула для расчета нахождения недостающего числа во втором массиве;
    // 7+9=16; 16+10=26; 26+11=37; 37+12=49 Еще раз складываем числа второго массива
    // 57-49=8 Найдено недостающее число во втором массиве;

    // English translation

    // Write a formula to calculate and find the missing numbers in the first and second arrays, based on the numbers we knew in the example;
    // 5,1,3,2 numbers in the first array;
    // 1+2=3; 3+3=6; 6+4=10; 10+5=15 add up the numbers that were in the first array;
    // S=5(5+1) / 2 = 5*6 / 2 = 15 Formula for calculating finding the missing number in the first array;
    // 1+2=3; 3+3=6; 6+5=11 Once again add the numbers of the first array;
    // 15-11=4 Found the missing number in the first array;
    // 7,9,10,11,12 numbers in the second array;
    // 7+9=16, 16+10=26, 26+11=37; 37+12=49 add the numbers of the second array;
    // S=6 (7+12) / 2 = 6 * 19 / 2 = 57 Formula for calculating finding the missing number in the second array;
    // 7+9=16; 16+10=26; 26+11=37; 37+12=49 Once again add the numbers of the second array.
    // 57-49=8 Found the missing number in the second array;


    public static void main(String[] args) {
        int[] num = {5,0,1,3,2}; // Числа массива № 1;
        int[] num1 = {7,9,10,11,12}; // Числа массива № 2;
        int n1 = FindMissingNumber(num, 1, 5); // Ищем недостающее число в массиве № 1; // The numbers of array № 1;
        int n2 = FindMissingNumber(num1, 7, 12); // Ищем недостающее число в массиве № 2; // The numbers of array № 2
        System.out.println("Недостающее число в первом массиве: " + n1); // Получаем недостающее число в массиве № 1 // Find the missing number in array  № 1;
        System.out.println("Недостающее число во втором массиве " + n2); // Получаем недостающее число в массиве № 2; //  Find the missing number in array №2;
    }

    public static int FindMissingNumber(int[] num, int start, int end) {
        int expectedSum = (end * (end + 1)) / 2 - ((start - 1) * start) / 2; // Расчёт ожидаемой суммы арифметической прогрессии; //  Calculation of the expected sum of arithmetic progression;
        int actualSum = 0;
        for (int i : num) {
            actualSum += i;
        }
        return expectedSum - actualSum; // Возвращение недостающих чисел в первом и во втором массивах; //  Return missing numbers in the first and second arrays;
    }
}

