/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_Ejercicio1;

import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * @param <T>
 * @param <K>
 */
public interface IABB <T, K extends Comparable> {
    
    public void insertar(NodoABB pNodo);

    public NodoABB buscar(K pKey);
}
