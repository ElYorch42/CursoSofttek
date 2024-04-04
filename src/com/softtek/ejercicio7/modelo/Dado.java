package com.softtek.ejercicio7.modelo;

public class Dado {
    private int tirada;

    public Dado() {
        this.tirada = (int)Math.floor((Math.random()*6)+1);
    }

    public int getTirada() {
        return tirada;
    }

    public void setTirada(int tirada) {
        this.tirada = tirada;
    }

    public void lanzar() {
        this.tirada = (int)Math.round(Math.random()*(6-1)+1);
    }

    public String dibujar() {
        String numero ="";
        switch (tirada) {
            case 1:
                numero+=("     \n");
                numero+=("  *  \n");
                numero+=("     ");
                break;
            case 2:
                numero+=("*    \n");
                numero+=("     \n");
                numero+=("    *");
                break;
            case 3:
                numero+=("*    \n");
                numero+=("  *  \n");
                numero+=("    *");
                break;
            case 4:
                numero+=("*   *\n");
                numero+=("     \n");
                numero+=("*   *");
                break;
            case 5:
                numero+=("*   *\n");
                numero+=("  *  \n");
                numero+=("*   *");
                break;
            case 6:
                numero+=("*   *\n");
                numero+=("*   *\n");
                numero+=("*   *");
                break;
            default:
                numero+=("error");
        }
        return numero;
    }
}
