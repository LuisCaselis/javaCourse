package com.enroute.example.numerosRomanos;

import java.util.HashMap;
import java.util.Scanner;

public class RomanoArabigo {


    public static void main(String[] args) {
        RomanConvertion object = new RomanConvertion();
        object.convertRomans();
    }


}

class RomanConvertion{

    static HashMap<String, Integer> values = new HashMap<>();

    public void convertRomans(){

        Scanner scanner = new Scanner(System.in);
        String romanNum;
        boolean valid;
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        do {
            valid = true;
            System.out.print("Input roman number (up to 3999):");
            romanNum = scanner.nextLine();
            for(int i=0; i<romanNum.length(); i++){
                String digit =  Character.toString(romanNum.charAt(i));
                if(values.get(digit)==null){
                    valid = false;
                }
            }
        }while (valid==false);

        int sum = 0;
        int[] digit = new int[romanNum.length()];
        for(int i=0; i<romanNum.length(); i++){
            digit[i] = values.get(Character.toString(romanNum.charAt(i)));
        }

        for(int i=0; i<romanNum.length(); i++){
            if ((i+1)<digit.length){
                if (digit[i]<digit[i+1]){
                    sum-= digit[i];
                }else {
                    sum+= digit[i];
                }
            }else {
                sum+= digit[i];
            }
        }

        System.out.println("Arabic: "+sum);
    }
}