package com.example.tetrisg8;

import android.graphics.Canvas;

public class Pieza {
    protected Celda[] pieza;

    public Celda[] getPieza() {
        return pieza;
    }

    //Se pinta la pieza
    public void dibujarPieza(Canvas canvas){
        pieza[0].pintarCelda(canvas);
        pieza[1].pintarCelda(canvas);
        pieza[2].pintarCelda(canvas);
        pieza[3].pintarCelda(canvas);
    }
}
