package com.softtek.ejercicio5.vista;

import com.softtek.ejercicio5.modelo.Tablas;

import java.util.Scanner;

public class TablasMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Tablas tablas = new Tablas(teclado.nextInt());
        System.out.print(tablas.mostrarTabla());
    }
}
