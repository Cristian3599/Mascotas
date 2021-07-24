package application_core.data_manager;

import java.util.List;

import application_core.model.Mascota;

/**
 * Clase que representa la estructura de un objeto para manejar los datos de las mascotas
 * @author Stiven Vélez Bedoya
 * @author Cristian David Gómez Becerra
 * @version 1.0
 */
public class DatosMascotas {
    //Lista en la que se almacenan las mascotas
    private List<Mascota> mascotas;

    /**
     * Constructor para instanciar el objeto
     */
    public DatosMascotas() {
        this.mascotas = new ArrayList<>();
    }

    /**
     * Registra una mascota en la lista de mascotas
     * @param mascota Objeto mascota que se almacenara en la lista
     */
    public void registrarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    /**
     * Busca una mascota en la lista dado un nombre
     * @param nombre Nombre de la mascota que se buscara
     * @return Objeto mascota si la encuentra, de lo contrario retorna null
     */
    public Mascota buscarMascota(String nombre) {
        for (Mascota mascota : this.mascotas) {
            if (mascota.getNombre().toUpperCase() == nombre.toUpperCase()) {
                return mascota;
            }
        }
        return null;
    }
}