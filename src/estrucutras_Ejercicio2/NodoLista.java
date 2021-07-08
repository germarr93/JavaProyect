/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucutras_Ejercicio2;

import dominio.editor.Cambio;

/**
 *
 * @author julmo
 */
public class NodoLista {
    private Cambio cambio;
    private NodoLista siguiente;

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio dato) {
        this.cambio = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoLista(Cambio pCambio){
        this.cambio = pCambio;
        this.siguiente = null;
    }
    
    
}
