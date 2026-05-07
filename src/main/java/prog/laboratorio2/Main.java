/*
Concesionaria de Autos
La concesionaria “AutoMG” desea comenzar el desarrollo de un sistema para gestionar sus vehículos.

Se solicita implementar un modelo básico utilizando composición de objetos.

Requisitos:
    Clase Motor
        Atributos:
            kilometrosRecorridos
            cilindrada (por ejemplo: 1.6, 2.0, etc.)
            caballosFuerza
        Métodos:
            requiereCambioAceite():
                Devuelve true si los kilómetros recorridos superan los 100.000 km, en caso contrario devuelve false.
    Clase Auto
        Atributos:
            marca
            modelo
            color
            Motor motor (composición)
            precio
        Métodos:
            avanzar(int km):
                Incrementa los kilómetros recorridos del motor.
                Invoca el método requiereCambioAceite() del motor.
                Si devuelve true, mostrar un mensaje con JOptionPane.showMessageDialog indicando que el auto necesita cambio de aceite.
    Clase Principal (Main)
            Crear un ArrayList<Auto> con al menos 3 autos distintos.
            Simular el avance de los autos con distintos valores de kilómetros (por ejemplo: 30.000, 50.000, 25.000).
            Mostrar la información de cada auto (puede ser por consola o usando JOptionPane).2
 */
package prog.laboratorio2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Auto> listaAutos = new ArrayList<>();
        Motor motorhib =  new Motor( 40000, 2.0, 165);
        Motor motoclas = new Motor( 65000, 1.8, 140); 
        Motor motorsuv = new Motor( 68000, 1.5, 180);
        
        Auto hibrido = new Auto( "Toyota", "Prius", "blanco", 42000, motorhib);
        Auto clasico = new Auto( "Volskwagen", "Gol", "Azul", 38000, motoclas);
        Auto suv = new Auto( "Honda", "CR-V", "Verde" , 55000, motorsuv);
        
        listaAutos.add(hibrido);
        listaAutos.add(clasico);
        listaAutos.add(suv);
        int opcion;
        
        do {
            System.out.println("####1.Toyota (kms actuales : " + listaAutos.get(0).motor.getKmRecorridos() + "km)" );
            System.out.println("####2.Volskwagen (kms actuales : " + listaAutos.get(1).motor.getKmRecorridos() + "km)" );
            System.out.println("####3.Honda (kms actuales : " + listaAutos.get(2).motor.getKmRecorridos() + "km)" );
            System.out.println("####0.Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
        
            while(opcion < 0 || opcion > 3){
                System.out.println("ERROR: Opcion invalida");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
            }
            
            if (opcion != 0) {
                System.out.println("\nIngrese kilometros recorridos para el " +  listaAutos.get(opcion-1).getMarca() + " " + listaAutos.get(opcion-1).getModelo() + "(actuales " + listaAutos.get(opcion-1).motor.getKmRecorridos()+"km): ");       
                int dato = sc.nextInt();
  
                listaAutos.get(opcion-1).avanzar(dato);
            
                System.out.println("----------------------------------------------------------\n");
            }else{
                System.out.println("\nSaliendo...");
            }
                                    
        } while (opcion != 0);
        
        
        // Informacion de cada Auto
        
        System.out.println("\nInformación de cada Auto:\n");        
        for (Auto e : listaAutos) {
            if (e != null) {
                e.mostrarInfo();
                System.out.println("----------------------------------------------------------");
            }
        }
                
        sc.close();
    }
            
}
