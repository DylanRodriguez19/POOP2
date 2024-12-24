package tablasmultiplicarpolimorfismo;
import java.util.ArrayList;
import java.util.Scanner;
public class TablasMultiplicarPolimorfismo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo para generar las tablas de multiplicar :");
        int maxNumero = scanner.nextInt();

        if (maxNumero < 2) {
            System.out.println("El numero debe ser mayor o igual a 2.");
            return;
        }

        ArrayList<TablaMultiplicar> tablas = new ArrayList<>();
        for (int i = 2; i <= maxNumero; i++) {
            tablas.add(new TablaAscendente(i));
            tablas.add(new TablaDescendente(i));
        }

        int sumaTotal = 0;
        for (TablaMultiplicar tabla : tablas) {
            tabla.mostrarTabla();
            sumaTotal += tabla.sumarResultados();
            System.out.println("Suma de los resultados de la tabla del " + tabla.numero + ": " + tabla.sumarResultados());
        }

        System.out.println("Suma total de todas las tablas: " + sumaTotal);
        scanner.close();
    }
}