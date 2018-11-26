package SEMA_SERVICIOS;

import java.util.*;

public class Hilo_hora implements Runnable{
    String Horas, Minutos, Segundos, ampm;
    Calendar Calendario;
    Thread H1;
    public String Hora;
    
    Canal mCanal;
    public void setCanal(Canal C){
        this.mCanal=C;
    }
    
    public Hilo_hora(){
        H1 = new Thread(this);
        H1.start();
    }

    @Override
    public void run() {
        Thread ot = Thread.currentThread();
     
     while(ot==H1){
         Calcula();
         Hora = Horas + ":" + Minutos + ":" + Segundos + " " + ampm;
         System.out.println(Hora);
         mCanal.SetStatus("HORA:  "+Hora);
         try{
             Thread.sleep(1000);
         }
         catch(InterruptedException e){             
         }
     }     
    }
    
    private void Calcula() {
        Calendar Calendario = new GregorianCalendar();
        Date FechaHoraActual = new Date();
        
        Calendario.setTime(FechaHoraActual);
        ampm = Calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM")) {
            int H = Calendario.get(Calendar.HOUR_OF_DAY);
            Horas = H>9?""+H:"0"+H;
        }
        else{
            Horas =  Calendario.get(Calendar.HOUR_OF_DAY)>9?""+Calendario.get(Calendar.HOUR_OF_DAY):"0"+Calendario.get(Calendar.HOUR_OF_DAY);
        }
        
        Minutos = Calendario.get(Calendar.MINUTE)>9?""+Calendario.get(Calendar.MINUTE):"0"+Calendario.get(Calendar.MINUTE);
        Segundos = Calendario.get(Calendar.SECOND)>9?""+Calendario.get(Calendar.SECOND):"0"+ Calendario.get(Calendar.SECOND);
    }
        
}
