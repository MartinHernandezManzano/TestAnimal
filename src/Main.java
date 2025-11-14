public class Main {
    public static void main(String[] args) {

        // Creamos un array de tipo Animal
        Animal[] animales = new Animal[2];

        // Metemos objetos Perro y Gato dentro del array
        animales[0] = new Perro();
        animales[1] = new Gato();

        // Recorremos el array y usamos hacerSonido()
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
