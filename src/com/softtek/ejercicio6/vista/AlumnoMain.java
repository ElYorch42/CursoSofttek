package com.softtek.ejercicio6.vista;

import com.softtek.ejercicio6.modelo.Alumno;

import java.util.Scanner;

public class AlumnoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alumno");
        String nombreAlumno = teclado.next();
        System.out.println("Introduzca el numero de parciales realizados");
        Alumno alumno = new Alumno(nombreAlumno,teclado.nextInt());
        for (int i = 0; i < alumno.getParciales().length; i++) {
            System.out.println("Introduce la nota del " + (i + 1) + "º parcial");
            alumno.setParcial(teclado.nextInt(),i);
        }
        System.out.println("El promedio es "+alumno.calcularPromedio());
        System.out.println("Calificaciones:");
        System.out.println(alumno.mostrarCalificaciones());
    }
}
