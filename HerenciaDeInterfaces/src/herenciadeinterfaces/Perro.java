package herenciadeinterfaces;
class Perro implements Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau Guau");
    }

    @Override
    public void amamantar() {
        System.out.println("El perro amamanta a sus crias");
    }
}