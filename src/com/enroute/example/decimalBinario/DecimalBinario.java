package com.enroute.example.decimalBinario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalBinario {

    public static void main(String[] args) {
        Convertion objectBinary = new Convertion();

        objectBinary.toBinary();
    }


}

class Convertion{

    public static void toBinary(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Decimal to Binary: ");
        int num = scan.nextInt();

        List<Integer> binaryNum = new ArrayList<Integer>();

        while(num > 0){
            binaryNum.add(0, num%2);
            num = num/2;
        }

        for (int digit:binaryNum) {
            System.out.print(digit);
        }
    }

}