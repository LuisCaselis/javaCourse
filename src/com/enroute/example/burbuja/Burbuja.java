package com.enroute.example.burbuja;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Burbuja burbuja = new Burbuja();

        burbuja.ordenar();
    }

    public void ordenar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers:");
        int size = scanner.nextInt();
        int [] numbers = new int[size];

        System.out.print("Insert numbers: ");
        for (int i=0; i<size; i++){
            numbers[i]=scanner.nextInt();
        }

        int temp = 0;
        boolean sorted = true;

        while(sorted){
            sorted=false;
            for(int i=0; i<numbers.length-1; i++){
                if(numbers[i+1]<numbers[i]){
                    temp = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i]=temp;
                    sorted=true;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
