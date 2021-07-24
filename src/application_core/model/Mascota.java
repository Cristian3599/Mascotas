package application_core.model;

/**
 * Clase que representa la estructura de un objeto mascota
 * @author Stiven Vélez Bedoya
 * @author Cristian David Gómez Becerra
 * @version 1.0
 */
public class Mascota {
    //Nombre de la mascota
    private String nombre;
    //Raza de la mascota
    private String raza;
    //Edad de la mascota
    private int edad;

    /**
     * Constructor con parametros para instanciar un objeto mascota
     * @param nombre Nombre que tendra la mascota
     * @param raza Raza de la mascota
     * @param edad Edad de la mascota
     */
    public Mascota (String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * Constructor sin parametros para instanciar un obejto mascota
     */
    public Mascota() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
    }

    /**
     * Obtiene el nombre de la mascota
     * @return Nombre de la mascota
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la raza de la mascota
     * @return Raza de la macota
     */
    public String getRaza() {
        return this.raza;
    }

    /**
     * Obtiene la edad de la mascota
     * @return Edad de la mascota
     */
    public int getEdad() {
        return this.edad;
    }
}