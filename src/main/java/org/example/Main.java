package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(12212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String numberStr = Integer.toString(number);
        String reversedNumber = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(reversedNumber);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String numberStr = String.valueOf(number);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = digitChar - '0';
            result.append(digitWords[digit]).append(" ");
        }

        return result.toString().trim();

    }
}
