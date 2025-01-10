
package Controlador;

import Modelo.EstudianteModelo;
import Vista.EstudianteVista;

public class EstudianteControlador {
    public EstudianteVista vista;
    public EstudianteModelo modelo;

    public EstudianteControlador(EstudianteModelo modelo ,  EstudianteVista vista) {
        this.vista = vista;
        this.modelo = modelo;
    }
    public void asignarNombre(String nombre){
        modelo.setNombre(nombre);
        
    }
    public void asignarCalificacion(double calificacion){
    modelo.setCalificacion(calificacion);    
    }
    public void iniciar(){
        vista.mostrarDatos(modelo.getNombre(), modelo.getCalificacion());
    }
}
