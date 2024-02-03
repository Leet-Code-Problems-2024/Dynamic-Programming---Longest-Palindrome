class Solution {
    fun longestPalindrome(s: String): String {
       
    val n = s.length
    // If the length is 1 or 0 then it is a palindrome
    if (n <= 1) {
        return s
    }

    // Creation of a 2D array for dynamic programming and avoidance of timeouts
    val dp = Array(n) { BooleanArray(n) }
    var start = 0
    var maxLength = 1

    // All substrings of length 1 are palindromes
    for (i in 0 until n) {
        dp[i][i] = true
    }

    // Check substrings of length 2
    for (i in 0 until n - 1) {
        if (s[i] == s[i + 1]) {
            dp[i][i + 1] = true
            start = i
            maxLength = 2
        }
    }

    // Check substrings of length 3 or more
    for (length in 3..n) {
        for (i in 0 until n - length + 1) {
            val j = i + length - 1
            if (dp[i + 1][j - 1] && s[i] == s[j]) {
                dp[i][j] = true
                start = i
                maxLength = length
            }
        }
    }

    return s.substring(start, start + maxLength)
    }
}
