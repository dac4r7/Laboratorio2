/*



 */
package prog.laboratorio2;

import javax.swing.JOptionPane;

/**
 *
 * @author DAC
 */
public class Motor {
    
  private int kilometrosRecorridos= 0;
  private double cilindrada; 
  private int caballosFuerza; 
   
  
 public Motor(){
     
 } 

    public Motor(int kilometrosRecorridos, double cilindrada, int caballosFuerza) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
        this.caballosFuerza = caballosFuerza;
    }
 
 public boolean requiereCambioAceite(int kms){
  
     if(kilometrosRecorridos +kms >100000){
         return true;
     }else{return false;}
     
     
 }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
       
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
 
 
}
