/**
 * @author DeathbatO
 */

public class Ejercicio09{
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro miPerro = new Perro("Buddy");
        Gato miGato = new Gato("Whiskers");

        // Llamar al método hacerSonido para cada animal
        miPerro.hacerSonido(); // Salida: Buddy hace: ¡Guau!
        miGato.hacerSonido();  // Salida: Whiskers hace: ¡Miau!
    }
}