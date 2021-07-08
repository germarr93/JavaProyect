 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * @param <T>
 * @param <X>
 * @param <K>
 */
public class NodoABB<T, K extends Comparable> {

    private List<T> values;
    private K key;
    private NodoABB izquierda;
    private NodoABB derecha;

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public NodoABB getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoABB izquierda) {
        this.izquierda = izquierda;
    }

    public NodoABB getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoABB derecha) {
        this.derecha = derecha;
    }


    public NodoABB(T Value, K key) {
        this.values = new ArrayList<>();
        this.key = key;
        this.izquierda = null;
        this.derecha = null;
        if(Value != null){
            this.values.add(Value);
        }
    }

    @Override
    public String toString() {
        return key.toString();
    }

}
