package tablasmultiplicarpolimorfismo;
class TablaDescendente extends TablaMultiplicar {
    public TablaDescendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla del " + numero + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    @Override
    public int sumarResultados() {
        int suma = 0;
        for (int i = 10; i >= 1; i--) {
            suma += numero * i;
        }
        return suma;
    }
}