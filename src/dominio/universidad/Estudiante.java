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
public class Estudiante {
    private int numeroEstudiante;
    private String nombre;
    private String apellido;
    private String documento;

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Estudiante(int numeroEstudiante, String nombre, String apellido, String documento) {
        this.numeroEstudiante = numeroEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    @Override
    public String toString(){
        return this.numeroEstudiante + " - " + this.apellido + " " + this.nombre + ", " + this.documento;
    } 
    
    
    
}
