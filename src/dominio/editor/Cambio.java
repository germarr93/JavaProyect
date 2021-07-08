/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.editor;

/**
 *
 * @author julmo
 */
public class Cambio {

    private int id;
    private String operacionRealizada;
    private int linea; 
    private int columna; 

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getOperacionRealizada() {
        return operacionRealizada;
    }

    public void setOperacionRealizada(String operacionRealizada) {
        this.operacionRealizada = operacionRealizada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cambio(int id, String operacionRealizada, int linea, int columna) {
        this.operacionRealizada = operacionRealizada;
        this.id = id;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public String toString() {
        return this.id + " " + this.operacionRealizada;
    }
}
