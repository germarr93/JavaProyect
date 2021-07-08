/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio3aed2020;

/**
 *
 * @author julmo Xavier de Mello y Germán Marr.
 */
public class Obligatorio3AED2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sistema unSistema = new Sistema();
        unSistema.crearSistema();
        unSistema.registrarEstudiante(1, "Xavier","de Mello","53130139");
        unSistema.registrarEstudiante(3, "German","Marr","5323446");
        unSistema.registrarEstudiante(4, "Julian","Montes de oca","78454567");
        unSistema.registrarEstudiante(5, "Brian","Lopez","531305139");
        unSistema.buscarEstudiante(4);
        
        unSistema.registarCurso(1, "Programacion 3", "nombre");
        unSistema.registarCurso(2, "Base de datos", "BD1");
        unSistema.registarCurso(3, "Programacion 2", "Prog2");
        unSistema.registarCurso(4, "Ingenieria", "Ing");
        unSistema.registarCurso(5, "Programacion 1", "Prog1");
        unSistema.registarCurso(6, "GNexus", "GX");
        unSistema.registarCurso(7, "Angular 9", "CLI");
        unSistema.registarCurso(8, "React", "rect");
        unSistema.buscarCurso(8);
        
        unSistema.inscribirEstudianteCurso(3, 7);
        unSistema.inscribirEstudianteCurso(3, 1);
        unSistema.inscribirEstudianteCurso(1, 1);
        unSistema.inscribirEstudianteCurso(4, 1);
        
        unSistema.inscribirEstudianteCurso(5, 8);
        unSistema.inscribirEstudianteCurso(3, 8);
        unSistema.inscribirEstudianteCurso(1, 8);
        unSistema.inscribirEstudianteCurso(4, 8);
        
        System.out.println("");
        unSistema.borrarCurso(1);
        unSistema.listarEstudiantesCurso(7);
        
        System.out.println("");
        System.out.println("PARTE 2 EDITOR DE TEXTO Visual studio code");
        
        unSistema.registrarCambio(1, "salto de linea", 1, 45);
        unSistema.registrarCambio(2, "se agrego la x ", 4, 455);
        unSistema.registrarCambio(3, "salto de linea", 12, 454);
        unSistema.registrarCambio(4, "salto de linea", 13, 45);
        
        unSistema.mostrarCambioDeshacer();
        unSistema.mostrarCambioRehacer();
        System.out.println("");
        
        unSistema.accionCtrlZ();
        System.out.println("un ctrlz");
        unSistema.accionCtrlZ();
        System.out.println("un ctrlz");
        unSistema.accionCtrlZ();
        System.out.println("un ctrlz");
        unSistema.accionCtrlZ();
        System.out.println("un ctrlz");
        unSistema.accionCtrlY();
        System.out.println("un ctrl y");
        unSistema.accionCtrlY();
        System.out.println("un ctrl y");
        unSistema.accionCtrlY();
        System.out.println("un ctrl y");
        unSistema.accionCtrlY();
        System.out.println("un ctrl y");
        unSistema.accionCtrlY();
    }
    
}
