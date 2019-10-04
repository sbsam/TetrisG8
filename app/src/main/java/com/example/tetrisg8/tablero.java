package com.example.tetrisg8;

public class tablero {

    int tablero[][] = new int[20][10];

    public void inicializarTablero() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    private boolean ocupadoBajar(Pieza pieza) { //comprueba si la pieza puede bajar
        boolean comprobar = false;
        for (int i = 0; i < 4; i++) { //borra la pieza para que al comprobar no se encuentre con una celda de la propia pieza
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = 0;
        }
        for (int i = 0; i < 4; i++) {
            if (tablero[(pieza.getPieza()[i].getX()) + 1][pieza.getPieza()[i].getY()] == 0 && ! (pieza.getPieza()[i].getX()==19)) { //comprueba si la celda de abajo no está ocupada o es la última
                comprobar = false;
            } else {
                comprobar = true;
                for (int j = 0; j < 4; j++) {
                    tablero[pieza.getPieza()[j].getX()][pieza.getPieza()[j].getY()] = pieza.getPieza()[j].getTipoPieza(); //si está ocupado vuelve a pintar la pieza y devuelve true
                }
                return comprobar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = pieza.getPieza()[i].getTipoPieza(); //si no está ocupado también vuelve a pintar la pieza
        }
        return comprobar;
    }

    private boolean ocupadoDcha(Pieza pieza) { //comprueba si la pieza puede moverse a la derecha
        boolean comprobar = false;
        for (int i = 0; i < 4; i++) { //borra la pieza para que al comprobar no se encuentre con una celda de la propia pieza
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = 0;
        }
        for (int i = 0; i < 4; i++) {
            if (tablero[pieza.getPieza()[i].getX()][(pieza.getPieza()[i].getY()) + 1] == 0 && !(pieza.getPieza()[i].getY() == 9)) { //comprueba si la celda de la derecha está ocupada o es la última
                comprobar = false;
            } else {
                comprobar = true;
                for (int j = 0; j < 4; j++) {
                    tablero[pieza.getPieza()[j].getX()][pieza.getPieza()[j].getY()] = pieza.getPieza()[j].getTipoPieza(); //si está ocupado vuelve a pintar la pieza y devuelve true
                }
                return comprobar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = pieza.getPieza()[i].getTipoPieza(); //si no está ocupado también vuelve a pintar la pieza
        }
        return comprobar;
    }

    private boolean ocupadoIzq(Pieza pieza) { //comprueba si la pieza puede moverse a la izquierda
        boolean comprobar = false;
        for (int i = 0; i < 4; i++) { //borra la pieza para que al comprobar no se encuentre con una celda de la propia pieza
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = 0;
        }
        for (int i = 0; i < 4; i++) {
            if (tablero[pieza.getPieza()[i].getX()][(pieza.getPieza()[i].getY()) - 1] == 0 && !(pieza.getPieza()[i].getY() == 0)) { //comprueba si la celda de la izquierda está ocupada o es la última
                comprobar = false;
            } else {
                comprobar = true;
                for (int j = 0; j < 4; j++) {
                    tablero[pieza.getPieza()[j].getX()][pieza.getPieza()[j].getY()] = pieza.getPieza()[j].getTipoPieza(); //si está ocupado vuelve a pintar la pieza y devuelve true
                }
                return comprobar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tablero[pieza.getPieza()[i].getX()][pieza.getPieza()[i].getY()] = pieza.getPieza()[i].getTipoPieza(); //si no está ocupado también vuelve a pintar la pieza
        }
        return comprobar;
    }

    private boolean ocupadoGiro(Pieza piezaGirada){
        boolean comprobar = false;
        for (int i = 0; i < 4; i++) { //borra la pieza para que al comprobar no se encuentre con una celda de la propia pieza
            tablero[piezaGirada.getPieza()[i].getX()][piezaGirada.getPieza()[i].getY()] = 0;
        }
        for (int i = 0; i < 4; i++) {
            if (tablero[piezaGirada.getPieza()[i].getX()][(piezaGirada.getPieza()[i].getY())] == 0 && !(piezaGirada.getPieza()[i].getX() < 0)
                    && !(piezaGirada.getPieza()[i].getX() > 19) && !(piezaGirada.getPieza()[i].getY() < 0) && !(piezaGirada.getPieza()[i].getY() > 9)) {
                //comprueba si las celdas están ocupadas o se salen del tablero
                comprobar = false;
            }
            else {
                comprobar = true;
                for (int j = 0; j < 4; j++) {
                    tablero[piezaGirada.getPieza()[j].getX()][piezaGirada.getPieza()[j].getY()] = piezaGirada.getPieza()[j].getTipoPieza(); //si está ocupado vuelve a pintar la pieza y devuelve true
                }
                return comprobar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tablero[piezaGirada.getPieza()[i].getX()][piezaGirada.getPieza()[i].getY()] = piezaGirada.getPieza()[i].getTipoPieza(); //si no está ocupado también vuelve a pintar la pieza
        }
        return comprobar;
    }

    public void bajarPieza (Pieza pieza){
        if (! ocupadoBajar (pieza)){ //si la fila de abajo no está ocupada la matriz de la ficha baja una posición
            for (int i=0; i<4; i++) {
                pieza.getPieza()[i].setX(pieza.getPieza()[i].getX() + 1);
                pieza.getPieza()[i].setY(pieza.getPieza()[i].getY() + 1);
            }
        }
    }
}