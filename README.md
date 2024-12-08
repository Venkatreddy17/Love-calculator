# Love-calculator
Love Calculator - Flames Calculation Explanation
Overview
The Love Calculator is a fun and simple program that calculates the compatibility between two names based on the FLAMES method. This method is commonly used for predicting the relationship or bond between two people based on their names. The word "FLAMES" stands for Friendship, Love, Affection, Marriage, Enmity, and Sisterhood, each representing a possible relationship outcome.

This repository provides a Python implementation of the Love Calculator, using the traditional FLAMES calculation logic. By inputting the names of two individuals, the program will calculate their "FLAMES" result, showing the relationship type that is most likely based on the given names.

How It Works
Step 1: Name Processing
The first step in the flames calculation is to take two names and remove any spaces, convert all letters to lowercase, and ignore any special characters. After this, the individual letters of each name are compared. This comparison process eliminates common letters between the two names, reducing the count to what is called the remaining letter count.

Step 2: FLAMES Sequence
After processing the names, a sequence of six categories is created:

F: Friendship
L: Love
A: Affection
M: Marriage
E: Enmity
S: Sisterhood
Step 3: Eliminating Categories
With the remaining letter count (after common letters are removed), the program proceeds to eliminate categories in the FLAMES sequence one by one. The elimination follows a circular pattern, where you start counting from the first letter and continue until the number of steps matches the remaining letter count.

For example, if the remaining letter count is 7, you will count 7 letters in the FLAMES sequence and eliminate the letter that lands on that count. The process continues with the remaining sequence, and this continues until one category is left.

Example
Let’s say we are calculating the love compatibility between the names John and Emily:

Process the names:

John → j, o, h, n
Emily → e, m, i, l, y
Common letters: None
Remaining letters: 9 (4 from "John" + 5 from "Emily")
FLAMES sequence: F, L, A, M, E, S

Eliminate letters based on the remaining count of 9:

Count to 9 and remove the 9th category (Sisterhood).
Repeat this step until only one category remains.
This process will give you the final result (for example, Love).

FLAMES Code Walkthrough
flames_calculator.py
Input Processing:

Takes two names as input.
Removes spaces, converts to lowercase, and counts the remaining letters after comparing the two names.
FLAMES Sequence Elimination:

Creates the list of categories: F, L, A, M, E, S.
Uses the remaining letter count to determine how many times to loop and eliminate categories from the list.
Final Result:

The last remaining letter in the FLAMES sequence is the result, representing the relationship between the two names.
