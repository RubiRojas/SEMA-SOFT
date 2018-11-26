
import SEMA_SERVICIOS.*;

public class Control2 {
    
    Canal mCanal;
    Clima mClaseClima;

    public Control2() {

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
