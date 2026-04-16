package edu.hugosuarez.EjerciciosEstructurasDatos;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Map<String,Integer> inventario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        añadirObjeto(inventario, "Anillo",3);
        añadirObjeto(inventario, "Pulsera",1);
        añadirObjeto(inventario, "Piercing",1);

        System.out.println(inventario);
    



    }

    private static void añadirObjeto(Map<String, Integer> inventario, String anillo, int i) {
    }
}
