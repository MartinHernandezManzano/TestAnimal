public class Main {
    public static void main(String[] args) {

        //creamos una instancia de cada objeto
        Animal Toby = new Perro();
        Animal Miguel = new Gato();

        //llamamos a los methods adaptados a cada animal
        Toby.hacerSonido();
        Miguel.hacerSonido();
    }
}
