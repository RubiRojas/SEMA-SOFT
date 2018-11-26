package Paquete;

import java.util.Observable;
import java.util.Observer;

public class Hora implements Observer {

    public void update(Observable o, Object arg) {

        //Obtenemos el mensaje que recibió el BroadCast
        //NO sabemos quien lo envió.
        String mensaje = arg.toString().toUpperCase();

        if (mensaje.equals("ENCENDER")) {
            System.out.println("Servicios prendidos");
        }
        if (mensaje.equals("APAGAR")) {
            System.out.println("Servicios apagados");
        }
    }

}
