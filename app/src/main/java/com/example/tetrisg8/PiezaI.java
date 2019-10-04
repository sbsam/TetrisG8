package com.example.tetrisg8;

public class PiezaI implements Pieza {
    private Celda[] pieza;

    public PiezaI() {
        pieza = new Celda[4];
    }


    @Override
    public Celda[] getPieza() {
        return pieza;
    }
}
