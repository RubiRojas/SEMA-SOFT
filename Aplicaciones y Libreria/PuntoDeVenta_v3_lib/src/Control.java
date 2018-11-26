
import SEMA_SERVICIOS.Hilo_hora;
import SEMA_SERVICIOS.Canal;

public class Control {

    static Canal mCanal;
    static FrmPuntoDeVenta2 frm;
    static Hilo_hora hiloHora;

    public void Enviar_Mensaje(String msj) {
        mCanal.SetStatus(msj);
    }

    public static void main(String[] args) {
        mCanal = new Canal();
        frm = new FrmPuntoDeVenta2();
        hiloHora = new Hilo_hora();
        mCanal.addObserver(frm);
        hiloHora.setCanal(mCanal);
        hiloHora.run();
        frm.setVisible(true);
        
    }

}
