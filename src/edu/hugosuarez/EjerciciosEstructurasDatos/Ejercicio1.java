package edu.hugosuarez.EjerciciosEstructurasDatos;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

    public static void main(String[] args) {
        Set<String> palabras = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce la palabra " + i + ": ");
            String palabra = scanner.nextLine();
            boolean añadida = palabras.add(palabra);

            if (!añadida) {
                System.out.println("Esa palabra ya existe.");
            }
        }

        System.out.println("Las palabras guardadas son :" + palabras);
        scanner.close();
    }
}