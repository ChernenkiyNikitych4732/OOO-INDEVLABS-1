English Translation

Java Technical Assessment. General: Write a function as described below and test scripts to verify that it works.

Details: Write a function that finds a missing number in an array. Given an array of consecutive numbers 0,1,2,3.... N with a missing term. The function finds the first missing number in the sequence. Example: Input data: [5,0,1,3,2], Output: 4. Input: [7, 9,10,11,12], Output: 8

Implement the function + tests and explain your thoughts and assumptions in the comments. You can submit the solution as a link to GitHub (or similar resource).

Note: 1 Think through all possible scenarios for testing your function, including corner cases. 2 Emailed solutions will not be accepted.

Statement of Work solution: 1) Calculate the array using the formula m(m+i) / 2, and find the missing number in the first array. Example: Input [5, 0, 1, 1, 3, 2], Output: 4. 2) Calculate the array using the formula m(m+i) / 2, and find the missing number in the second array. Example: Input [7, 9, 10, 11, 12], Output: 8. 3) Write a formula for the calculation, and find the missing numbers in the first and second arrays. 4) Calculate the expected sum of the arithmetic progression. 5) Return the missing numbers in the first and second arrays. 6) Write basic methods for testing. 7) Add Junit tests for testing