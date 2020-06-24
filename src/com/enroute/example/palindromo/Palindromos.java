package com.enroute.example.palindromo;

import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        Palindromos palindromo = new Palindromos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it palindrome?: ");
        String word = scanner.nextLine();

        word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();
        if(palindromo.isItPalindrome(word)){
            System.out.println("\nIt's palindrome!");
        }else
            System.out.println("\nNot a palindrome");

    }

    public boolean isItPalindrome(String word){
        String[] digits = word.split("");
        boolean result = true;
        int size = digits.length;
        int f = size-1;

        for(int i =0; i<size/2; i++){
            if(digits[i].equals(digits[f])){
                f--;
            }else{
                result = false;
                i=size/2;
            }
        }

        return result;
    }

}
