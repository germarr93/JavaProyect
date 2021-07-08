/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucutras_Ejercicio2;

import dominio.editor.Cambio;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IPila {

    void insertarInicio(Cambio pCambio);

//Pos: Inserta el elemento n al principio de la lista.
    /**
     * ***** PREDICADO ********
     */
//Pos: Retorna true si la lista no tiene nodos.
    boolean estaVacia();

    /**
     * ***** TESTEO *********
     */
//Pos: Imprime la lista en pantalla.
    void imprimir();

    /**
     * **** BORRADO *******
     */
//Pos: Borra el primer nodo.
    void eliminar();

//Pos: Borra todos los nodos de la lista.
    void vaciar();
}
