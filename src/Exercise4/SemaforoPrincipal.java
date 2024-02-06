package Exercise4;

import Exercise4.Semaforo;
import Exercise4.SemaforoPrincipal;


public class SemaforoPrincipal {
    public static void main(String[] args) {
        Semaforo semaforo1 = new Semaforo();

        semaforo1.colorBombilla = "rojo";
        semaforo1.mostrarMensajeAlVehiculo();

        semaforo1.encenderSemaforo();

        semaforo1.colorBombilla = "amarillo";
        semaforo1.mostrarMensajeAlVehiculo();

        semaforo1.colorBombilla = "verde";
        semaforo1.mostrarMensajeAlVehiculo();

    }


}
