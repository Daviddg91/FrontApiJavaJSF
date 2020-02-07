/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontClientesJSF;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
 

@Named(value = "saludo")
@RequestScoped
public class SaludoJSFManagedBean {
    Calendar cal = Calendar.getInstance();
    Date date=cal.getTime();
    DateFormat dateFormatHMS = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormatHour = new SimpleDateFormat("HH");

    /**
     * Creates a new instance of SaludoJSFManagedBean
     */
    public SaludoJSFManagedBean() {
    }
    public String saludo(){
    String hora=dateFormatHour.format(date);
     int hora2=Integer.parseInt(hora);
    String saludo="";
    
    if(hora2<=12){
    saludo= "buenos-dias";
    }
    if(hora2>=15){
        saludo = "buenas-tardes";
    }
    if(hora2>=22){
          saludo = "buenas-noches";
     
    }
        
    return saludo;
    
    }
    
    public String hora(){
      
    String formattedDate=dateFormatHMS.format(date);
    
        
    
    return formattedDate;
    }
}

