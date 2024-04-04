package com.softtek.ejercicio5.modelo;

public class Tablas {

    private int numero;

    public Tablas(int numero) {
        this.numero = numero;
    }

    public String mostrarTabla() {
        String tabla="Tabla del "+numero;
        for (int i = 1; i <= 10; i++) {
            tabla+=numero+" por "+i+" es "+(numero*i)+"\n";
        }
        return tabla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
