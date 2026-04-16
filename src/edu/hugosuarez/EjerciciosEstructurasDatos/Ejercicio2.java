package edu.hugosuarez.EjerciciosEstructurasDatos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el número " + (i +1) + " :");
            numeros[i] = sc.nextInt();

        }

        System.out.println("Los números guardados son : " + Arrays.toString(numeros));
        System.out.println("Se han almacenado " + numeros.length + " números" );
        System.out.println(" La suma de todos los números es : " + (numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]));

    }
}
