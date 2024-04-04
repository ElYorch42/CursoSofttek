package com.softtek.ejercicio3.vista;

import com.softtek.ejercicio3.modelo.Areas;

public class AreasMain {
    public static void main(String[] args) {
        Areas areas = new Areas();

        System.out.println("Area circulo "+areas.calcularAreaCirculo(3));
        System.out.println("Area rectangulo "+areas.calcularAreaRectangulo(2,4));
    }
}
