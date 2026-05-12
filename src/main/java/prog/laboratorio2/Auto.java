/*

 */
package prog.laboratorio2;

import javax.swing.JOptionPane;


/**
 *
 * @author DAC
 */
public class Auto {
    
 private String marca;
 private String modelo;
 private String color;
 Motor motor ;
 private double precio;

    public Auto(String marca, String modelo, String color, Motor motor, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
        
    }
    
  public void avanzar(int km){
    boolean estado =  motor.requiereCambioAceite(km);
          if(  estado  ){
              String msj = "El vehiculo : "+ this.marca + " " + this.modelo +" necesita cambio de aceite";
           
              //Mostrar el mensaje por encima de todas las ventanas
            final javax.swing.JFrame busca = new javax.swing.JFrame();
            busca.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(busca,msj,"AVISO",JOptionPane.ERROR_MESSAGE); //  });
             motor.setKilometrosRecorridos(100000);
      }else {
          motor.setKilometrosRecorridos(km + motor.getKilometrosRecorridos());
            }   
  }
  
  public String mostrarInfo(){
       return "\n-----------INFORMACION--DEL--VEHICULO-------------"+
              "\nMarca : " + getMarca() + "\n" + "Modelo : "+ getModelo()+
                            "\nColor : " + getColor() + "\n Precio: "+ getPrecio()+
                            "\n  Kilometros recorridos : " + motor.getKilometrosRecorridos() +
                            "\n  Motor(Cilindrada) : " + motor.getCilindrada() +
                            "\n  Motor(Caballos de fuerza) : " + motor.getCaballosFuerza()+
                            "\n------------------------------------------------------";      
  }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

  
}
