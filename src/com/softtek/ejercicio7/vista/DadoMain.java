package com.softtek.ejercicio7.vista;

import com.softtek.ejercicio7.modelo.Dado;

import java.util.Scanner;

public class DadoMain {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(dado.getTirada());
            System.out.println(dado.dibujar());
            System.out.println("Quieres volver a tirar? s/n");
            dado.lanzar();
        } while (teclado.next().equals("s"));

    }
}
