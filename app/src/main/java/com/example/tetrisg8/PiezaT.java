package com.example.tetrisg8;

import android.content.Context;

public class PiezaT extends Pieza {

    //Se construye la pieza
    public PiezaT(Context context) {
        pieza = new Celda[4];
        pieza[0] = new Celda(context, 0, 3, 1, 6);
        pieza[1] = new Celda(context, 0, 4, 1, 6);
        pieza[2] = new Celda(context, 1, 4, 1, 6);
        pieza[3] = new Celda(context, 0, 5, 1, 6);
    }

}
