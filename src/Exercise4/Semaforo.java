package Exercise4;

public class Semaforo {
    public String colorBombilla;
    public boolean encendidoApagado;

    public Semaforo() {
        super();
        this.colorBombilla = null;
        this.encendidoApagado = false;
    }

    public void cambiarColor(String colorNuevo){
        this.colorBombilla = colorNuevo;
    }

    public void apagarSemaforo(){
        this.encendidoApagado = false;
    }

    public void encenderSemaforo(){
        this.encendidoApagado = true;
    }

    public void mostrarMensajeAlVehiculo(){
        if (!encendidoApagado) {
            System.out.println("El semaforo esta apagado");
        } else {
            if (this.colorBombilla == "verde") {
                System.out.println("Puede seguir");
            }
            if (this.colorBombilla == "amarillo") {
                System.out.println("Siga con precaución");
            }
            if (this.colorBombilla == "rojo") {
                System.out.println("Pare");
            }
        }
    }


}
