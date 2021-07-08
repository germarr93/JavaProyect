/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio3aed2020;

import dominio.editor.Cambio;
import dominio.universidad.Curso;
import dominio.universidad.Estudiante;
import estructuras_Ejercicio1.ABB;
import estructuras_Ejercicio1.HashEstudiantes;
import estructuras_Ejercicio1.NodoABB;
import estrucutras_Ejercicio2.Pila;
import java.util.LinkedList;

/**
 *
 * @author julmo
 */
public class Sistema {

    HashEstudiantes listaEstudiantes;
    ABB cursos;
    Pila editorTexto;
    //ABB abbEstudiantes;
    public enum TipoRet {
        OK, ERROR, NO_IMPLEMENTADA
    };

    /*
    Utilizado para retornar en los métodos del sistema, 
    OK: Cuando la acción se realiza sin problema
    ERROR: Cuando no se pudo realizar la acción, ya sea por que se ingresó un numeroEstudiante repetido, misma id de curso, no hay espacio en la estructura, etc.
    NO_IMPLEMENTADA: Cuando no se desarrolló el método.
     */
    public void crearSistema() {
        //incialización de estructuras.
        listaEstudiantes = new HashEstudiantes(10);
        editorTexto = new Pila();
    }

    /* Ejercicio Estudiantes */
    public TipoRet registrarEstudiante(int numeroEstudiante, String nombre, String apellido, String documento) {
        Estudiante nuevoEstudiante = new Estudiante(numeroEstudiante, nombre, apellido, documento);
        listaEstudiantes.insertar(nuevoEstudiante);
        return TipoRet.OK;
    }

    public TipoRet buscarEstudiante(int numeroEstudiante) {
        //Dependiendo de la estructura elegida, se puede cambiar numeroEstudiante por otro atributo
        //Aunque idealmente, se agregaría otro buscar: buscarEstudiante(String nombre) por ejemplo.
        System.out.println(listaEstudiantes.buscar(numeroEstudiante));
        return TipoRet.OK;
    }

    public TipoRet registarCurso(int id, String codigo, String nombre) {
        Curso unCurso = new Curso(id, codigo, nombre);
        NodoABB<Estudiante, Curso> nuevoNodo = new NodoABB(null, unCurso);
        if (cursos != null) {
            cursos.insertar(nuevoNodo);
        } else {
            cursos = new ABB(nuevoNodo);
        }
        return TipoRet.OK;
    }

    public TipoRet buscarCurso(int idCurso) {
        NodoABB nodo = (NodoABB) cursos.buscar(idCurso);
        if (nodo != null) {
            System.out.println(nodo.getKey().toString());
        } else {
            System.out.println("No encontrado");
        }
        return TipoRet.OK;
    }
    //Post: imprime en pantalla el curso encontrado, imprime "no encontrado" en caso de no encontrarlo.
    
    public TipoRet inscribirEstudianteCurso(int numeroEstudiante, int idCurso) { //int idCurso - String codigoCurso
        Estudiante estudiante = this.listaEstudiantes.buscar(numeroEstudiante);
        this.cursos.insertarEstudiante(estudiante, idCurso);
        return TipoRet.OK;
    }

    public TipoRet listarEstudiantesCurso(int id) {
        this.cursos.obtenerEstudiantesEnCurso(id);
        return TipoRet.OK;
    }
    //Post: Imprime en pantalla los estudiantes de un curso. 

    public TipoRet borrarCurso(int idCurso) { //int idCurso - String codigoCurso
        this.cursos.borrar(idCurso);
        return TipoRet.OK;
    }

    /* Ejercicio Editor */
    public TipoRet registrarCambio(int pId,String cambioRealizado, int fila, int columna) {
        Cambio cambio = new Cambio(pId,cambioRealizado,fila,columna);
        editorTexto.insertarInicio(cambio);
        return TipoRet.NO_IMPLEMENTADA;
    }
    
    //Post: Se registra en el sistema un nuevo cambio, simulando el almacenamiento de los cambios realizados en un editor. Ej: "pegar texto", "agregar salto línea", "//"

    public TipoRet mostrarCambioDeshacer() {
        System.out.println(editorTexto.mostrarDeshacer());
        return TipoRet.OK;
    }
    //Post: Imprime en pantalla la acción a deshacer (el último cambio realizado)
    
    public TipoRet mostrarCambioRehacer() {
        System.out.println(editorTexto.mostrarRehacer());
        return TipoRet.OK;
    }
    //Post: Imprime en pantalla la acción a rehacer (el último cambio que se deshizo)

    public TipoRet accionCtrlZ() {
        editorTexto.eliminar();
        return TipoRet.OK;
    }
    //Post: imprime en pantalla la el cambio deshecho, y edita el historial de cambios

    public TipoRet accionCtrlY() {
        editorTexto.Rehacer();
        return TipoRet.OK;
    }
    //Post: imprime en pantalla el cambio re-hecho, y edita el historial de cambios
}
