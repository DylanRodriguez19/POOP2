package herenciadeinterfaces;
public class HerenciaDeInterfaces {
    public static void main(String[] args) {
    
        Mamifero perro = new Perro();
        Mamifero gato = new Gato();

        System.out.println("Perro:");
        perro.hacerSonido();
        perro.amamantar();
        System.out.println("---------------------------------------");
        System.out.println("Gato:");
        gato.hacerSonido();
        gato.amamantar();
    }
}