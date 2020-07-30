package com.enroute.example.numerosPrimos;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        SolvePrime object = new SolvePrime();

        System.out.println(object.isItPrime());
    }

}

class SolvePrime{

    public boolean isItPrime(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it prime: ");
        int num = scanner.nextInt();

        boolean result = true;

        for(int i=2; i<num/2; i++){
            if(num%i == 0 ){
                result = false;
            }
        }

        return result;
    }
}
