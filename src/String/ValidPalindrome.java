package String;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true

Input: s = "race a car"
Output: false

Input: s = " "
Output: true
*/
public class ValidPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if(s.length() == 0) return true;

        s = s.toLowerCase();

        int i = 0, f = s.length() - 1;
        boolean isValid = true;

        while(i<f && isValid){
            if(s.charAt(i) == s.charAt(f)){
                i++;
                f--;
            }else {
                isValid = false;
            }
        }

        return isValid;
    }
}
