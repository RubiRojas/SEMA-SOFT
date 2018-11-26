package Paquete;
import java.util.Observable;

public class Canal extends Observable {
    
    private String mensaje;

    public Canal() {
        mensaje = "";
    }

    public void SetStatus(String msj) {
        this.mensaje = msj;
        this.setChanged();
        this.notifyObservers(msj);
    }

    public String GetStatus() {
        return this.mensaje;
    }
}
