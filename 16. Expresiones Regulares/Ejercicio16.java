import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ejercicio16 {
     public static void main(String[] args) {

        String texto = "Tengo 2 perros, 1 gato y 34 peces.";

        // --- Extraer todos los números ---
        Pattern patternNumeros = Pattern.compile("\\d+");
        Matcher matcherNumeros = patternNumeros.matcher(texto);

        System.out.println("Números encontrados:");
        while (matcherNumeros.find()) {
            System.out.println(matcherNumeros.group());
        }

        // --- Validar email ---
        String email = "example@mail.com";
        Pattern patternEmail = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        System.out.println("\nEmail válido: " + patternEmail.matcher(email).matches());

        // --- Validar número de teléfono (formato simple internacional o local) ---
        String telefono = "+57 3201234567";
        Pattern patternTelefono = Pattern.compile("^\\+?\\d[\\d\\s-]{7,14}$");
        System.out.println("Teléfono válido: " + patternTelefono.matcher(telefono).matches());

        // --- Validar URL ---
        String url = "https://www.ejemplo.com/recurso";
        Pattern patternURL = Pattern.compile("^(https?://)?([\\w.-]+)\\.([a-z]{2,})(/\\S*)?$", Pattern.CASE_INSENSITIVE);
        System.out.println("URL válida: " + patternURL.matcher(url).matches());
    }
}
