/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_Ejercicio1;

import dominio.universidad.Estudiante;

/**
 *
 * @author julmo
 */
public class HashEstudiantes {

    Estudiante[] tabla;
    private int tamano;

    public HashEstudiantes(int tamano) {
        tabla = new Estudiante[tamano];
        this.tamano = tamano;
    }

    public void insertar(Estudiante pEstudiante) {
        int posicion;
        int i = 0;
        posicion = pEstudiante.getNumeroEstudiante() % tamano;

        while (tabla[posicion] != null) {
            i++;
            //Doble
            posicion = (pEstudiante.getNumeroEstudiante() + i * (7 - (pEstudiante.getNumeroEstudiante() % 7))) % tamano;
        }

        tabla[posicion] = pEstudiante;
    }

    public Estudiante buscar(int key) {
        int posicion = key % tamano;
        Estudiante estudiante = null;
        int i = 0;

        while (tabla[posicion] != null && tabla[posicion].getNumeroEstudiante() != key) {
            i++;
            posicion = (key + i * (7 - (key % 7))) % tamano;
        }
        estudiante = tabla[posicion];
        return estudiante;
    }
}
