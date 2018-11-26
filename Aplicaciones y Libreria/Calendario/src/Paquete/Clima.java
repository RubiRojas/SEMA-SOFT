package Paquete;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class Clima implements Observer {

    FrmClima Clima = new FrmClima();

    @Override
    public void update(Observable o, Object arg) {

        String Mensaje = arg.toString().toUpperCase();

        if (Mensaje.equals("CLIMA")) {

            if (Clima.isActive()) {
               
            } 
            else {

                if (Clima.Valor == 0) {
                    Clima = new FrmClima();
                    Clima.setVisible(true);
                } 
                else {

                    Clima.setVisible(true);

                }

            }
        }

        if (Mensaje.equals("ENCENDER")) {
            System.out.println("Clima Listo");
        }
        if (Mensaje.equals("APAGAR")) {
            System.out.println("Clima Apagado");
        }

    }

}
