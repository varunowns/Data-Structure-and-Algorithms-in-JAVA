class Solution {
    public boolean isPalindrome(int x) {
        int orgNUm = x;
        int lastDigit;
        int revNum = 0;

        while (x > 0) {
            lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x = x / 10;
        }
        if (revNum == orgNUm) {
            return true;
        } else {
            return false;
        }
    }
}