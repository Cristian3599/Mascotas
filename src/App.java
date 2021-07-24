import javax.swing.JOptionPane;

import application_core.control.ControlMascotas;
import application_core.model.Mascota;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.PruebaMascotas();
    }

    public void PruebaMascotas() {
        try {
            //Se instancia la clase ControlMascotas
            ControlMascotas control = new ControlMascotas();
            //Se pregunta si se desea añadir una mascota
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea registrar una mascota?", "Pregunta!", JOptionPane.YES_NO_OPTION);
            //Mientras el usuario quiera agregar mascotas se le pediran los datos
            while (resp = JOptionPane.YES_OPTION) {
                String nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la mascota");
                String raza = JOptionPane.showInputDialog(null, "Digite el nombre de la mascota");
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad de la mascota"));

                control.registrarMascotas(new Mascota(nombre, raza, edad));
                resp = JOptionPane.showConfirmDialog(null, "¿Desea registrar una mascota?", "Pregunta!", JOptionPane.YES_NO_OPTION);
            }

            //Se pregunta si se desea buscar una mascota
            int buscar = JOptionPane.showConfirmDialog(null, "¿Desea buscar una mascota?", "Pregunta!", JOptionPane.YES_NO_OPTION);
            //Mientras el usuario quiera buscar mascotas se le pedira que registre el nombre de la mascota
            while (buscar = JOptionPane.YES_OPTION) {
                String nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la mascota que desea buscar");
                Mascota mascota = control.buscarMascota(nombre);
                if (mascota != null) {
                    String info = "Información de la mascota: \n\n Nombre: " + mascota.getNombre() + "\n Raza: " + mascota.getRaza() + "\n Edad: " + mascota.getEdad();
                    JOptionPane.showMessageDialog(null, info);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro ninguna mascota con el nombre: " + nombre);
                }

                buscar = JOptionPane.showConfirmDialog(null, "¿Desea buscar una mascota?", "Pregunta!", JOptionPane.YES_NO_OPTION);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "La edad debe ser un numero entero");
        }
    }
}
