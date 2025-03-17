package String;

import java.math.BigInteger;
/*
Given two binary strings a and b, return their sum as a binary string.

Input: a = "11", b = "1"
Output: "100"

Input: a = "1010", b = "1011"
Output: "10101"
*/
public class AddBinary {

    public static void main(String[] args){
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }


    public static String addBinary(String a, String b) {
        if(a.length() == 0 || b.length() == 0) return "";

        BigInteger numA = new BigInteger(a, 2);
        BigInteger numB = new BigInteger(b, 2);

        BigInteger sum = numA.add(numB);
        return sum.toString(2);
    }
}
