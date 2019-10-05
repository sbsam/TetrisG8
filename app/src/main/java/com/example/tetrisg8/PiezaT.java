package com.example.tetrisg8;


public class PiezaT extends Pieza {

    //Se construye la pieza
    public PiezaT() {
        pieza = new Celda[4];
        pieza[0] = new Celda(0, 3, 1, 6);
        pieza[1] = new Celda(0, 4, 1, 6);
        pieza[2] = new Celda(1, 4, 1, 6);
        pieza[3] = new Celda(0, 5, 1, 6);
    }

}
