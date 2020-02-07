package FrontClientesJSF ;


import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



 
 

@Named(value = "inicioVariado")
@RequestScoped
public class InicioVariadoManagedBean {
  
     private int aleat;
    public InicioVariadoManagedBean() {
    }
    public String generaPaginasVariadas(){
  String pagina="inicio";
  aleat = getRandomNumberInRange(0, 4);
        if(aleat==1){
            pagina="inicio_1";
        }
        if(aleat==2){
            pagina="inicio_2";
        }
        if(aleat==3){
            pagina="inicio_3";
        }
        if(aleat==4){
            pagina="inicio_4";
        }
    return pagina;
    
    }

    public int getAleat() {
        return aleat;
    }

   
 
    
    
    
 private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}

