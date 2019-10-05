package com.example.tetrisg8;

public class FuncionamientoJuego {

    public Pieza generarPieza (){
        int tipoPieza = (int) Math.floor(Math.random()*6+1); //función para generar un numero aleatorio del 1 al 7
        Pieza pieza = new Pieza (tipoPieza);
        return pieza;
    }
}
