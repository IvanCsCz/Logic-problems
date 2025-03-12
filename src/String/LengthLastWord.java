package String;
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Input: s = "Hello World"
Output: 5

Input: s = "   fly me   to   the moon  "
Output: 4
*/
public class LengthLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        if(s.length() < 1 || s.length() >10e4) return 0;
        int count = 0;

        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' ')count++;
            else if(count == 0) continue;
            else break;
        }
        return count;
    }
}
