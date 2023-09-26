/**
 * Clase de Armario
 */
public class Armario {
    /**
     * Atributos
     */
    String lugar;

    String ropa;

    /**
     * Constructor de la clase
     * @param lugar lugar al que irá
     * @param ropa la ropa que se le aconseja usar
     *
     * Complejidad temporal: O(1) Complejidad constante
     */

    public Armario(String lugar, String ropa) {

        this.lugar = lugar;
        this.ropa = ropa;

    }
    /**
     * Método de imprime la ropa que dede usar segun el lugar
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void escoger(){
        System.out.println("Para ir al "+lugar+ " use "+ropa);

    }
}


