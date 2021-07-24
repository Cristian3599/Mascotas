package application_core.control;

import application_core.data_manager.DatosMascotas;

import application_core.data_manager.DatosMascotas;

/**
 * Clase con la que se gestiona el funcionamiento del programa
 * @author Stiven Vélez Bedoya
 * @author Cristian David Gómez Becerra
 * @version 1.0
 */
public class ControlMascotas {
    //Objeto para acceder a la lista de mascotas
    private DatosMascotas datosMascotas;

    /**
     * Constructor para instanciar el objeto
     */
    public ControlMascotas() {
        this.datosMascotas = new DatosMascotas();
    }

    /**
     * Envia el objeto mascota para que se registre en la lista
     * @param mascota Objeto mascota que sera registrado
     */
    public void registrarMascotas(Mascota mascota) {
        this.datosMascotas.registrarMascota(mascota);
    }

    /**
     * Envia el nombre de la mascota para buscarla en la lista
     * @param nombre Nombre de la mascota que se buscara
     * @return Objeto mascota si se encontro en la lista, de lo contrario retorna null
     */
    public Mascota buscarMascota(String nombre) {
        return this.datosMascotas.buscarMascota(nombre);
    }
}