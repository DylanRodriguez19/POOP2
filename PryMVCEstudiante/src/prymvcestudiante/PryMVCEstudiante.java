
package prymvcestudiante;

import Controlador.EstudianteControlador;
import Modelo.EstudianteModelo;
import Vista.EstudianteVista;

public class PryMVCEstudiante {

    public static void main(String[] args) {
        EstudianteModelo eModelo = new EstudianteModelo();
        EstudianteVista eVista = new EstudianteVista();
        EstudianteControlador eControlador = new EstudianteControlador(eModelo, eVista);
     eControlador.asignarNombre("Jose");
     eControlador.asignarCalificacion(9.8);
     eControlador.iniciar();
    }
    
}
