package com.enroute.example.ecuacionCuadratica;

import java.util.Scanner;

public class Cuadraticas {



    public static void main(String[] args) {
        ResolveEcuation object = new ResolveEcuation();


        object.formulaGeneral();
    }


}

class ResolveEcuation{
    static int A = 0;
    static int B = 0;
    static int C = 0;


    static void formulaGeneral(){
        Scanner scan = new Scanner(System.in);
        double root, resultPos, resultNeg;

        do{
            System.out.print("a = ");
            A = scan.nextInt();
        }while(A==0);
        System.out.print("b = ");
        B = scan.nextInt();
        System.out.print("c = ");
        C = scan.nextInt();

        int temp = B*B - 4*(A*C);
        if(temp<=0){
            System.out.println("Imaginario :D");
        }else{
            root = Math.sqrt(temp);
            resultPos = (-B + root) / (2*A);
            resultNeg = (-B - root) / (2*A);
            System.out.printf("+x = %.2f | -x = %.2f", resultPos, resultNeg);
        }



    }


}
