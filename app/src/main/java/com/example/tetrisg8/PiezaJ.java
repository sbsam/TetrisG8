package com.example.tetrisg8;

import android.content.Context;

public class PiezaJ extends Pieza {

    //Se construye la pieza
    public PiezaJ(Context context) {
        pieza = new Celda[4];
        pieza[0] = new Celda(context, 2, 4, 1, 2);
        pieza[1] = new Celda(context, 0, 5, 1, 2);
        pieza[2] = new Celda(context, 1, 5, 1, 2);
        pieza[3] = new Celda(context, 2, 5, 1, 2);
    }

}
