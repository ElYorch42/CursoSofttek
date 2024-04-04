package com.softtek.ejercicio8String.vista;

public class CadenaTextoMain {
    public static void main(String[] args) {
        String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        String[] arrayString = cadena.split(" ");
        System.out.println(arrayString[0]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[6]);

        System.out.println(cadena.indexOf("m"));

        System.out.println("longitud: "+cadena.length());

    }
}
