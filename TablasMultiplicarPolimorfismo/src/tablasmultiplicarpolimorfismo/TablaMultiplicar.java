package tablasmultiplicarpolimorfismo;
import java.util.ArrayList;
import java.util.Scanner;


abstract class TablaMultiplicar {
    protected int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarTabla();

    public abstract int sumarResultados();
}