package com.example.tetrisg8;


public class PiezaS extends Pieza {

    //Se construye la pieza
    public PiezaS() {
        pieza = new Celda[4];
        pieza[0] = new Celda(1, 3, 1, 5);
        pieza[1] = new Celda(0, 4, 1, 5);
        pieza[2] = new Celda(1, 4, 1, 5);
        pieza[3] = new Celda(0, 5, 1, 5);
    }

}
