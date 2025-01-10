
package controler;

import model.SumaModelo;
import view.SumaVista;

public class SumaControlador {
   public SumaModelo modelo;
   public SumaVista vista;

    public SumaControlador(SumaModelo modelo, SumaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
   public void iniciar(){
     int num1, num2, resultados, resultador,resultadom;
       num1=vista.pedirNumero("Ingrese numero 1");
       num2=vista.pedirNumero("Ingrese numero 2");
       System.out.println("Suma:");
       resultados=modelo.sumar(num1,num2);
       vista.mostrarResultado(resultados);
       System.out.println("Multiplicacion:");
       resultadom=modelo.multiplicar(num1, num2);
       vista.mostrarResultado(resultadom);
       System.out.println("Resta");
       resultador=modelo.resta(num1, num2);
        vista.mostrarResultado(resultador);
   }
}
