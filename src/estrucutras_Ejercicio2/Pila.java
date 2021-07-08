/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucutras_Ejercicio2;

import dominio.editor.Cambio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julmo
 */
public class Pila implements IPila {

    private NodoLista inicio;
    
    private static List<NodoLista> rehacer = new ArrayList<>();

    
    public Pila() {
        this.inicio = null;
    }

    @Override
    public void insertarInicio(Cambio pCambio) {
        NodoLista nodo = new NodoLista(pCambio);
        nodo.setSiguiente(inicio);
        this.inicio = nodo;
    }

    @Override
    public boolean estaVacia() {
        return this.inicio == null;
    }

    public Cambio mostrarDeshacer(){
        NodoLista nodo = this.inicio;
        return nodo.getCambio();
    }
    
    public Cambio mostrarRehacer(){
        return this.inicio.getCambio();
    }

    @Override
    public void eliminar() {
        if (!this.estaVacia()) {
            rehacer.add(this.inicio);
            this.inicio = this.inicio.getSiguiente();
            this.imprimir();
        }
    }
    
    public void Rehacer(){
        if(rehacer.size() > 0){
            this.insertarInicio(rehacer.get(rehacer.size() - 1).getCambio());
            rehacer.remove(rehacer.size() - 1);
            this.imprimir();
        }
    }
  
    @Override
    public void vaciar() {
        while (this.inicio != null) {
            this.eliminar();
        }
    }

    public void vaciarLista() {
        this.inicio = null;
    }
    
    @Override
    public void imprimir() {
        if (this.estaVacia()) {
            System.out.println("La lista es vacia");
        } else {
            NodoLista aux = this.inicio;
            while (aux != null) {
                System.out.println(aux.getCambio());
                aux = aux.getSiguiente();
            }
        }
    }
}
