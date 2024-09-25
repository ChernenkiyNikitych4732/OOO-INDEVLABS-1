Техническая оценка Java. Общие сведения: Напишите функцию, как описано ниже, и протестируйте сценарии для проверки ее работоспособности.

Подробности: Напишите функцию, которая находит недостающее число в массиве. Дан массив последовательных чисел 0,1,2,3... N с отсутствующим членом. Функция находит первое отсутствующее число в последовательности. Пример: Входные данные: [5,0,1,3,2], Выход: 4. Вход: [7, 9,10, 11, 12], Выход: 8

Реализуйте функцию + тесты и объясните свои мысли и предположения в комментариях. Вы можете отправить решение в виде ссылки на github (или аналогичный ресурс).

Примечание: 1 Продумайте все возможные сценарии тестирования вашей функции, включая угловые случаи. 2 Решения, присланные по электронной почте, не принимаются.

Решение технического задания: 1) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число в первом массиве. Пример: Вход [5, 0, 1, 3, 2], Выход: 4. 2) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число во втором массиве. Пример: Вход [7, 9, 10, 11, 12], Выход: 8. 3) Написать формулу для расчета, и найти недостающие числа в первом и во втором массивах. 4) Сделать расчет ожидаемой сумму арифметической прогрессии. 5) Вернуть недостающие числа в первом и во втором массивах. 6) Написать основные методы для тестирования. 7) Добавить JUnit тесты для проверки.


English Translation

Java Technical Assessment. General: Write a function as described below and test scripts to verify that it works.

Details: Write a function that finds a missing number in an array. Given an array of consecutive numbers 0,1,2,3.... N with a missing term. The function finds the first missing number in the sequence. Example: Input data: [5,0,1,3,2], Output: 4. Input: [7, 9,10,11,12], Output: 8

Implement the function + tests and explain your thoughts and assumptions in the comments. You can submit the solution as a link to github (or similar resource).

Note: 1 Think through all possible scenarios for testing your function, including corner cases. 2 Emailed solutions will not be accepted.

Statement of Work solution: 1) Calculate the array using the formula m(m+i) / 2, and find the missing number in the first array. Example: Input [5, 0, 1, 1, 3, 2], Output: 4. 2) Calculate the array using the formula m(m+i) / 2, and find the missing number in the second array. Example: Input [7, 9, 10, 11, 12], Output: 8. 3) Write a formula for the calculation, and find the missing numbers in the first and second arrays. 4) Calculate the expected sum of the arithmetic progression. 5) Return the missing numbers in the first and second arrays. 6) Write basic methods for testing. 7) Add Junit tests for testing