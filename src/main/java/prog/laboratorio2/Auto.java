/*

 */
package prog.laboratorio2;

import javax.swing.JOptionPane;


/**
 *
 * @author Alumno
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
              String msj = "El auto necesita cambio de aceite";
           // System.out.println("el auto necesita cambio de aceite");    
          //     javax.swing.SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(null,msj,"AVISO",JOptionPane.ERROR_MESSAGE); //  });
             motor.setKilometrosRecorridos(100000);
      }else {
          motor.setKilometrosRecorridos(km + motor.getKilometrosRecorridos());
            }
       
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
