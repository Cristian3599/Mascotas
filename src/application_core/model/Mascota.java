package application_core.model;

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;

    public Mascota (String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Mascota() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
    }

    public String getNombre() {
        return this.nombre;
    }
}