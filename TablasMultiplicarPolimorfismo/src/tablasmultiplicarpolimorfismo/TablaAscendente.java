package tablasmultiplicarpolimorfismo;
class TablaAscendente extends TablaMultiplicar {
    public TablaAscendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla del " + numero + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    @Override
    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
}