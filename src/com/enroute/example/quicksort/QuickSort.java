package com.enroute.example.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        String[] words = {"hola", "adios", "gato", "perro", "cable"};

        quick.quickSort(words, 0, words.length-1);
        System.out.println(Arrays.toString(words));
    }

    private static int particion(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
        while (true) {

            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }

            if (izquierda >= derecha) {
                return derecha;
            } else {
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;

                izquierda++;
                derecha--;
            }
        }
    }

    private static void quickSort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quickSort(arreglo, izquierda, indiceParticion);
            quickSort(arreglo, indiceParticion + 1, derecha);
        }
    }
}
