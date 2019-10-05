package com.example.tetrisg8;

import android.content.Context;

public class PiezaO extends Pieza {

    //Se construye la pieza
    public PiezaO(Context context) {
        pieza = new Celda[4];
        pieza[0] = new Celda(context, 0, 4, 1, 4);
        pieza[1] = new Celda(context, 1, 4, 1, 4);
        pieza[2] = new Celda(context, 0, 5, 1, 4);
        pieza[3] = new Celda(context, 1, 5, 1, 4);
    }

}
