
package calendario;

import SEMA_SERVICIOS.*;



public class Control {
    
    Canal mCanal;
    Clima mClaseClima;

    public Control() {

        mCanal = new Canal();
        mClaseClima = new Clima();
    }

    public void Suscribir() {
        mCanal.addObserver(mClaseClima);
    }

    public void Enviar_Mensaje(String Mensaje) {
        mCanal.SetStatus(Mensaje);
    }
}
