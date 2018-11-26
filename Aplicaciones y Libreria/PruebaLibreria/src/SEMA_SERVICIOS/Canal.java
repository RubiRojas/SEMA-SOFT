
package SEMA_SERVICIOS;

import java.util.Observable;

public class Canal extends Observable {
    
    private String Mensaje;

    public Canal() {
        Mensaje = "";
    }

    public void SetStatus(String m) {
        this.Mensaje = m;
        this.setChanged();
        this.notifyObservers(m);
    }

    public String getStatus() {
        return this.Mensaje;
    }
    
}
