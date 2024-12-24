package herenciadeinterfaces;
class Gato implements Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau Miau");
    }

    @Override
    public void amamantar() {
        System.out.println("El gato amamanta a sus crias");
    }
}