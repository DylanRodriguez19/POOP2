
package prymvc;

import controler.SumaControlador;
import model.SumaModelo;
import view.SumaVista;

public class PryMVC {

    public static void main(String[] args) {
           SumaModelo modelo = new SumaModelo();
           SumaVista vista = new SumaVista();
           SumaControlador controlador= new SumaControlador(modelo, vista);
           controlador.iniciar();
    }
    
}
