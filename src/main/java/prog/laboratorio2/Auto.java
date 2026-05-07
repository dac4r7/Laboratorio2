/*

 */
package prog.laboratorio2;

import javax.swing.JOptionPane;


/**
 *
 * @author Alumno
 */
public class Auto {
    private final String marca;
    private final String modelo;
    private final String color;
    private final double precio;
    public final Motor motor;       

    public Auto(String marca, String modelo, String color, double precio, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
    }
    
    public void avanzar(int km){
        if (motor.requiereCambioAceite(km + motor.getKmRecorridos())) {
            String msj = "El auto necesita cambio de aceite";
            
            //Mostrar el mensaje por encima de todas las ventanas
            final javax.swing.JFrame buscador = new javax.swing.JFrame();
            buscador.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(buscador, msj, "AVISO", JOptionPane.ERROR_MESSAGE);
            buscador.dispose();
            
        }else{
            System.out.println("Avanzaste " + km + "km!");
            motor.setKilometrosRecorridos(km + motor.getKmRecorridos());
            System.out.println("kilometraje actualizado del vehiculo: " + motor.getKmRecorridos() + "km");
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
    
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Color: " + getColor() + " | Precio: " + getPrecio());
        System.out.println("Kilometraje : " + motor.getKmRecorridos()+ "km" + " | Cilindrada: " + motor.getCilindrada() + " | HP: " + motor.getCaballosFuerza());        
    }

}
