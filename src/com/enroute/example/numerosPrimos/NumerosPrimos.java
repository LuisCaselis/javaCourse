package com.enroute.example.numerosPrimos;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        NumerosPrimos object = new NumerosPrimos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it prime: ");
        int numero = scanner.nextInt();

        System.out.println(object.isItPrime(numero));
    }

    public boolean isItPrime(int num){
        boolean result = true;

        for(int i=2; i<num/2; i++){
            if(num%i == 0 ){
                result = false;
            }
        }

        return result;
    }
}
