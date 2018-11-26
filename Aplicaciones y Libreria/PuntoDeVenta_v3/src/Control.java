
import Paquete.*;

public class Control {

    static Canal mCanal;
    static Hora mHora;
    static FrmPuntoDeVenta2 frm;
    static Hilo_hora hiloHora;

    public void Enviar_Mensaje(String msj) {
        mCanal.SetStatus(msj);
    }

    public static void main(String[] args) {
        mCanal = new Canal();
        mHora = new Hora();
        frm = new FrmPuntoDeVenta2();
        hiloHora = new Hilo_hora();
        mCanal.addObserver(mHora);
        mCanal.addObserver(frm);
        hiloHora.setCanal(mCanal);
        hiloHora.run();
        frm.setVisible(true);
        
    }

}
