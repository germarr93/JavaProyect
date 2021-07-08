/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.universidad;

/**
 *
 * @author julmo
 */
public class Curso implements Comparable {

    private int id;
    private String nombre;
    private String codigo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Curso(int id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + codigo;
    }

    @Override
    public int compareTo(Object o) {
        Curso unCurso = (Curso)o;
        return unCurso.getNombre().compareTo(this.getNombre());
    }

}
