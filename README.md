Техническая оценка Java. Общие сведения: Напишите функцию, как описано ниже, и протестируйте сценарии для проверки ее работоспособности.

Подробности: Напишите функцию, которая находит недостающее число в массиве. Дан массив последовательных чисел 0,1,2,3... N с отсутствующим членом. Функция находит первое отсутствующее число в последовательности. Пример: Входные данные: [5,0,1,3,2], Выход: 4. Вход: [7, 9,10, 11, 12], Выход: 8

Реализуйте функцию + тесты и объясните свои мысли и предположения в комментариях. Вы можете отправить решение в виде ссылки на github (или аналогичный ресурс).

Примечание: 1 Продумайте все возможные сценарии тестирования вашей функции, включая угловые случаи. 2 Решения, присланные по электронной почте, не принимаются.

Решение технического задания: 1) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число в первом массиве. Пример: Вход [5, 0, 1, 3, 2], Выход: 4. 2) Рассчитать массив по формуле m(m+i) / 2, и найти недостающее число во втором массиве. Пример: Вход [7, 9, 10, 11, 12], Выход: 8. 3) Написать формулу для расчета, и найти недостающие числа в первом и во втором массивах. 4) Сделать расчет ожидаемой сумму арифметической прогрессии. 5) Вернуть недостающие числа в первом и во втором массивах. 6) Написать основные методы для тестирования. 7) Добавить JUnit тест для проверки.