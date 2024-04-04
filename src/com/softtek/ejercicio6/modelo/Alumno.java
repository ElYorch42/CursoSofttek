package com.softtek.ejercicio6.modelo;

public class Alumno {

    private String nombreCompleto;
    private int[] parciales;

    public Alumno(String nombreCompleto, int numParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new int[numParciales];
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < parciales.length; i++) {
            suma += (double) parciales[i];
        }
        return suma/parciales.length;
    }

    public String mostrarCalificaciones() {
        String texto = "";
        for (int i = 0; i < parciales.length; i++) {
            texto +="La nota del "+(i+1)+"º parcial es "+parciales[i]+"\n";
        }
        return texto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int[] getParciales() {
        return parciales;
    }

    public void setParcial(int parcial,int pos) {
        this.parciales[pos] = parcial;
    }


    public void setParciales(int[] parciales) {
        this.parciales = parciales;
    }
}
