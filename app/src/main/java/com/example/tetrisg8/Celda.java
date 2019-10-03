package com.example.tetrisg8;

import android.graphics.drawable.Drawable;

public class Celda { //Clase celda de la que están formadas las piezas
    private int x;
    private int y;
    private int tipoPieza;
    private Drawable dibujo;

    public Celda(int x, int y, int tipo){
        this.x = x;
        this.y = y;
        tipoPieza = tipo;
        switch (tipoPieza){
            case 1:
            {
                break;
            }
            case 2:
            {
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
                break;
            }
            case 5:
            {
                break;
            }
            case 6:
            {
                break;
            }
            case 7:
            {
                break;
            }
        }
    }

}
