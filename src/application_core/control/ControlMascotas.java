package application_core.control;

import application_core.data_manager.DatosMascotas;

import application_core.data_manager.DatosMascotas;

public class ControlMascotas {
    private DatosMascotas datosMascotas;

    public ControlMascotas() {
        this.datosMascotas = new DatosMascotas();
    }

    public void registrarMascotas(Mascota mascota) {
        this.datosMascotas.registrarMascota(mascota);
    }

    public Mascota buscarMascota(String nombre) {
        return this.datosMascotas.buscarMascota(nombre);
    }
}