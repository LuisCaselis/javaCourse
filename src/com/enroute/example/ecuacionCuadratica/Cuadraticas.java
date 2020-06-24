package com.enroute.example.ecuacionCuadratica;

import java.util.Scanner;

public class Cuadraticas {

    static int A = 0;
    static int B = 0;
    static int C = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cuadraticas object = new Cuadraticas();

        do{
            System.out.print("a = ");
            A = scan.nextInt();
        }while(A==0);
        System.out.print("b = ");
        B = scan.nextInt();
        System.out.print("c = ");
        C = scan.nextInt();

        object.formulaGeneral();
    }

    static void formulaGeneral(){

        double root, resultPos, resultNeg;

        root = Math.sqrt(B*B - 4*(A*C));
        resultPos = (-B + root) / (2*A);
        resultNeg = (-B - root) / (2*A);

        System.out.printf("+x = %.2f | -x = %.2f", resultPos, resultNeg);
    }
}
