package com.example.tetrisg8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class Celda { //Clase celda de la que están formadas las piezas
    private int x; // Coordenada x de la celda en el tablero
    private int y; // Coordenada y de la celda en el tablero
    private int ancho; // Ancho de la celda
    private int alto; // Alto de la celda
    private int tipoPieza; // Tipo de pieza a la que pertenece la celda
    private Drawable dibujo; // Drawable que representa la celda
    private int xCentroTabl; // Coordenada x central del tablero
    private int yCentroTabl; // Coordenada y central del tablero
    private int xAnterior; // Coordenada x previa de la celda
    private int yAnterior; // Coordenada y previa de la celda

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getTipoPieza(){
        return tipoPieza;
    }

    public void setTipoPieza(int tipoPieza) { this.tipoPieza = tipoPieza; }

    public Celda(Context context, int x, int y, int tamaño, int tipo){
        this.x = x;
        this.y = y;
        this.ancho = tamaño;
        this.alto = tamaño;
        tipoPieza = tipo;
        switch (tipoPieza){
            case 1:
            {
                dibujo = redimensionarCelda(context,R.color.cyan,ancho,alto);
                break;
            }
            case 2:
            {
                dibujo = redimensionarCelda(context,R.color.azul,ancho,alto);
                break;
            }
            case 3:
            {
                dibujo = redimensionarCelda(context,R.color.naranja,ancho,alto);
                break;
            }
            case 4:
            {
                dibujo = redimensionarCelda(context,R.color.amarillo,ancho,alto);
                break;
            }
            case 5:
            {
                dibujo = redimensionarCelda(context,R.color.verde,ancho,alto);
                break;
            }
            case 6:
            {
                dibujo = redimensionarCelda(context,R.color.morado,ancho,alto);
                break;
            }
            case 7:
            {
                dibujo = redimensionarCelda(context,R.color.rojo,ancho,alto);
                break;
            }
        }
    }

    public Drawable redimensionarCelda(Context context, int color, int ancho, int alto){
        //Se asigna el color de la celda
        Bitmap BitmapOrg = BitmapFactory.decodeResource(context.getResources(), color);
        Bitmap resized = Bitmap.createScaledBitmap(BitmapOrg, ancho, alto, true);
        return new BitmapDrawable(resized);
    }

    public void pintarCelda(Canvas canvas){ // método que dibuja la celda
        int x = xCentroTabl - ancho/2;
        // int y = yCentroTabl - alto/2;
        int y = 0;
        dibujo.setBounds(x, y, x+ancho, y+alto);
        dibujo.draw(canvas);
        xAnterior = xCentroTabl;
        yAnterior = y;
    }

}