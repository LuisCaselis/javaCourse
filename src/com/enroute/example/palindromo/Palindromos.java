package com.enroute.example.palindromo;

import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        SolutionPali palindromo = new SolutionPali();

        palindromo.isItPalindrome();
    }

}

class SolutionPali{

    public void isItPalindrome(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it palindrome?: ");
        String word = scanner.nextLine();

        word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();

        String[] digits = word.split("");
        boolean isPalindrome = true;
        int size = digits.length;
        int f = size-1;

        for(int i =0; i<size/2; i++){
            if(digits[i].equals(digits[f])){
                f--;
            }else{
                isPalindrome = false;
                i=size/2;
            }
        }

        if(isPalindrome){
            System.out.println("\nIt's palindrome!");
        }else
            System.out.println("\nNot a palindrome");
    }
}