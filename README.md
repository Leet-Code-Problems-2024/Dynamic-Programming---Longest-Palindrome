# Dynamic-Programming---Longest-Palindrome

# Palindrome Detection and Longest Palindromic Substring in Kotlin

## Overview

This Kotlin project includes functions to detect whether a given string is a palindrome and find the longest palindromic substring within a word.

Algorithm Explanation
The solution initializes a 2D array (dp) to store whether a substring is a palindrome.
It checks for palindromes in substrings of length 1 and 2.
Dynamic programming is used to check for palindromes in substrings of length 3 or more, updating the dp array as needed.
The algorithm keeps track of the starting index and length of the longest palindromic substring found so far.

