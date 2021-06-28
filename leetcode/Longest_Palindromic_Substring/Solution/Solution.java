package Solution;

class Solution {
    int size = 0;
    String answer ="";
   public String longestPalindrome(String s) {
       for (int i = 0; i < s.length(); i++) {
           int left = i - 1;
           int right = i + 1;
           if (isZero()) {
               answer = String.valueOf(s.charAt(i));
               size = 1;
           }
           checkPalindromic(s, left, right);
       }
       for (int i = 0; i < s.length() - 1; i++) {
           int start = i;
           int partner = i + 1;
           int left = start - 1;
           int right = partner + 1;
           if (isSameCharacter(s, start, partner)) {
               if (size < 2) {
                   answer = s.substring(start, partner + 1);
                   size = 2;
               }
               checkPalindromic(s, left, right);
           }
       }
       return answer;
   }
   public  boolean isSameCharacter(String s, int start, int partner) {
       return s.charAt(start) == s.charAt(partner);
   }

   public  boolean isZero() {
       return size == 0;
   }

   public  void checkPalindromic(String s, int left, int right) {
       while (left >= 0 && right < s.length()) {
           if (isSameCharacter(s, left, right)) {
               if (right - left + 1 > size) {
                   answer = s.substring(left, right + 1);
                   size = right - left + 1;
               }
               left -= 1;
               right += 1;
           } else {
               break;
           }
       }
   }
}