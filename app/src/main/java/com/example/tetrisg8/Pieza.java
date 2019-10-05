package com.example.tetrisg8;

import android.graphics.Canvas;

public class Pieza {
    protected int tipopieza;
    protected Celda[] pieza;

    public Celda[] getPieza() {
        return pieza;
    }

    public Pieza(){
        tipopieza = 1;
    }

    public Pieza(int tipopieza){
        switch (tipopieza){
            case 1:
                Pieza PiezaI = new PiezaI ();
                break;
            case 2:
                Pieza PiezaJ = new PiezaJ ();
                break;
            case 3:
                Pieza PiezaL = new PiezaL ();
                break;
            case 4:
                Pieza PiezaO = new PiezaO ();
                break;
            case 5:
                Pieza PiezaS = new PiezaS ();
                break;
            case 6:
                Pieza PiezaT = new PiezaT ();
               break;
            case 7:
                Pieza PiezaZ = new PiezaZ ();
                break;
        }
    }

    //Se pinta la pieza
    public void dibujarPieza(Canvas canvas){
        pieza[0].pintarCelda(canvas);
        pieza[1].pintarCelda(canvas);
        pieza[2].pintarCelda(canvas);
        pieza[3].pintarCelda(canvas);
    }
}
