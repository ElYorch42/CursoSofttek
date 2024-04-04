package com.softtek.ejercicio4.modelo;

public class Campos {

    private int numX;

    public Campos(int numX) {
        this.numX = numX;
    }

    public void muestra() {
        System.out.println("El valor de x es "+numX);
    }
    public void incrementa(int incremento) {
        numX += incremento;
    }

    public int getNumX() {
        return numX;
    }

    public void setNumX(int numX) {
        this.numX = numX;
    }
}
