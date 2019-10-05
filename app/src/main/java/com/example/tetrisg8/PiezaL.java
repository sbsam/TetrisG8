package com.example.tetrisg8;

import android.content.Context;

public class PiezaL extends Pieza {

    //Se construye la pieza
    public PiezaL(Context context) {
        pieza = new Celda[4];
        pieza[0] = new Celda(context, 0, 4, 1, 3);
        pieza[1] = new Celda(context, 1, 4, 1, 3);
        pieza[2] = new Celda(context, 2, 4, 1, 3);
        pieza[3] = new Celda(context, 2, 5, 1, 3);
    }

}
