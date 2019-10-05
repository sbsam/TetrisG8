package com.example.tetrisg8;

import android.content.Context;


public class PiezaI extends Pieza {

    //Se construye la pieza
    public PiezaI(Context context) {
        pieza = new Celda[4];
        pieza[0] = new Celda(context, 0, 4, 1, 1);
        pieza[1] = new Celda(context, 1, 4, 1, 1);
        pieza[2] = new Celda(context, 2, 4, 1, 1);
        pieza[3] = new Celda(context, 3, 4, 1, 1);
    }


}
