/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_Ejercicio1;

import dominio.universidad.Curso;
import dominio.universidad.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * @param <T>
 * @param <K>
 */
public class ABB<T, K extends Comparable> implements IABB<T, K> {

    private NodoABB raiz;

    public ABB(NodoABB raiz) {
        this.raiz = raiz;
    }

    @Override
    public void insertar(NodoABB nuevoNodo) {
        insertar(this.raiz, nuevoNodo);
    }

    public void insertarEstudiante(T pValue, K key) {
        this.insertarEstudiante((Estudiante) pValue, key);
    }

    private void insertarEstudiante(Estudiante pEstudiante, K pIdCurso) {
        NodoABB elCurso = this.buscar(pIdCurso);
        if (elCurso != null) {
            elCurso.getValues().add(pEstudiante);
        }
    }

    private NodoABB insertar(NodoABB nodo, NodoABB nuevoNodo) {
        if (nodo == null) {
            nodo = nuevoNodo;
            return nodo;
        }
        Curso cursoEnRaiz = (Curso) nodo.getKey();
        Curso nuevoCurso = (Curso) nuevoNodo.getKey();
        if (nuevoCurso.getId() < cursoEnRaiz.getId()) {
            nodo.setIzquierda(insertar(nodo.getIzquierda(), nuevoNodo));
        } else if (nuevoCurso.getId() > cursoEnRaiz.getId()) {
            nodo.setDerecha(insertar(nodo.getDerecha(), nuevoNodo));
        }
        return nodo;
    }

    private NodoABB buscar(NodoABB pNodo, int pKey) {
        if (pNodo == null) {
            return null;
        }
        Curso unCurso = (Curso) pNodo.getKey();
        if (unCurso.getId() == pKey) {
            return pNodo;
        }
        if (pKey < unCurso.getId()) {
            return buscar(pNodo.getIzquierda(), pKey);
        } else if (pKey > unCurso.getId()) {
            return buscar(pNodo.getDerecha(), pKey);
        }
        return null;
    }

    @Override
    public NodoABB buscar(K pKey) {
        return buscar(this.raiz, (Integer) pKey);
    }

    public void obtenerEstudiantesEnCurso(K pKey) {
        NodoABB unCurso = this.buscar(pKey);
        if (unCurso != null) {
            for (Estudiante estudiante : (ArrayList<Estudiante>) unCurso.getValues()) {
                System.out.println(estudiante);
            }
        }
    }

    public void borrar(K key) {
        this.borrar(this.raiz, (Integer) key);
    }
    
    private NodoABB borrar(NodoABB pNodo,int pKey){
        if(pKey == ((Curso)this.raiz.getKey()).getId()){
            this.raiz = null;
        }
        if(pNodo == null)
            return pNodo;
        Curso curso = (Curso)pNodo.getKey();
        if(pKey < curso.getId()){
            pNodo.setIzquierda(this.borrar(pNodo.getIzquierda(), pKey));
        } else if (pKey > curso.getId()){
            pNodo.setDerecha(this.borrar(pNodo.getDerecha(), pKey));
        } else if(pNodo.getIzquierda() != null && pNodo.getDerecha() != null) {
            pNodo.setKey(minimoDerecha(pNodo.getDerecha()).getKey());
            pNodo.setDerecha(this.borrar(pNodo.getDerecha(), ((Curso)pNodo.getKey()).getId()));
        } else {
            pNodo = (pNodo.getIzquierda() != null) ? pNodo.getIzquierda() : pNodo.getDerecha();
        }
        return pNodo;
    }

    private NodoABB minimoDerecha(NodoABB pNodo) {
        while (pNodo.getIzquierda() != null) {
            pNodo = pNodo.getIzquierda();
        }
        return pNodo;
    }
}
