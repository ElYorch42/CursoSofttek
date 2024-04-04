package com.softtek.ejercicio3.modelo;

public class Areas {

    public Areas() {
    }

    public double calcularAreaCirculo(int radio) {
        return Math.PI* Math.pow(radio,2);
    }

    public double calcularAreaRectangulo(int lado1, int lado2) {
        return lado1*lado2;
    }
}
