/**
 * Primera clase que se ejecuta
 */
public class Principal {
    /**
     * Primer método que se ejecuta en la aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {

            Armario Gimnasio = new Armario("Gimnasio", "sudadera");

            Armario Universidad = new Armario("Universidad", "Jean y chaqueta");

            Armario Casa = new Armario("Casa", "pijama");

        Gimnasio.escoger();
        Universidad.escoger();
        Casa.escoger();

        }
    }
