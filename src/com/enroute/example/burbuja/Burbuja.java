package com.enroute.example.burbuja;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Burbuja burbuja = new Burbuja();
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        //int [] numbers = {1, 3, 5, 10, 40, 30, 50, 63};

        System.out.print("Insert numbers: ");
        for (int i=0; i<10; i++){
            numbers[i]=scanner.nextInt();
        }

        burbuja.ordenar(numbers);
    }

    public void ordenar(int[] numbers){

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
