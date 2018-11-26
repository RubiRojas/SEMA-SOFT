
package calendario;
import  Paquete.Canal;
import Paquete.Clima;



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
        mCanal.setStatus(Mensaje);
    }
}
