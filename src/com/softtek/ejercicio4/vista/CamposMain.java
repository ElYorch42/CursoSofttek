package com.softtek.ejercicio4.vista;

import com.softtek.ejercicio4.modelo.Campos;

public class CamposMain {
    public static void main(String[] args) {
        Campos campos = new Campos(5);
        campos.muestra();
        campos.incrementa(2);
        campos.muestra();
    }
}
