
import SEMA_SERVICIOS.Clima;
import SEMA_SERVICIOS.Hilo_hora;
import SEMA_SERVICIOS.Canal;

public class Control {

    static Canal mCanal;
    static Hilo_hora hiloHora;
    static Ejemplo Ejemploo;
    Clima mClaseClima;
    
    public static void main(String[] args) {
        mCanal = new Canal();
        Ejemploo = new Ejemplo();
        hiloHora = new Hilo_hora();
        mCanal.addObserver(Ejemploo);
        hiloHora.setCanal(mCanal);
        hiloHora.run();
        Ejemploo.setVisible(true);

    }
}
