package com.example.tetrisg8;

public class tablero {
    int tablero [][] = new int [20][10];

    public void inicializarTablero(){
        for (int i=0; i<20; i++){
            for (int j=0; j<10; j++){
                tablero[i][j] = 0;
            }
        }
    }

    private boolean ocupadoBajar (Ficha ficha){ //comprueba si la pieza puede bajar
        boolean comprobar;
        for (int i=0; i<4;i++){
            if (ficha[4][i] == 0 && tablero[ficha.posi][ficha.posj+i] == 0){ //ficha.posi es la fila mas baja del tablero que ocupa y ficha.posj la columna mas hacia la izq que ocupa
                comprobar=false;
            }
            else {
                comprobar=true;
                return comprobar;
            }
        }
        return comprobar;
    }

    public void bajarFicha (Ficha ficha){
        if ! (ocupadoBajar (ficha)){ //si la fila de abajo no está ocupada la matriz de la ficha baja una posición
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    ficha[i][j]++;
                }
            }
        }
    }


}