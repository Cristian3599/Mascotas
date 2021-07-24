package application_core.data_manager;

import java.util.List;

import application_core.model.Mascota;

public class DatosMascotas {
    private List<Mascota> mascotas;

    public DatosMascotas() {
        this.mascotas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public Mascota buscarMascota(String nombre) {
        for (Mascota mascota : this.mascotas) {
            if (mascota.getNombre().toUpperCase() == nombre.toUpperCase()) {
                return mascota;
            }
        }
        return null;
    }
}