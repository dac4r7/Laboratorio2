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
 * @author Alumno
 */
public class test {

    /**
  
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int dato=1,opcion=1;
        ArrayList <Auto> listaautos = new ArrayList<>();
        Motor motorhib =  new Motor( 40000, 2.0, 165);
        Motor motoclas = new Motor( 65000, 1.8, 140); 
        Motor motorsuv = new Motor( 68000, 1.5, 180);
        
        Auto hibrido = new Auto( "Toyota", "Prius", "blanco",motorhib, 42000);
        Auto clasico = new Auto( "Volskwagen", "Gol", "Azul", motoclas, 38000);
        Auto suv = new Auto( "Honda", "CR-V", "Verde",motorsuv , 55000);
        
        listaautos.add(hibrido);
        listaautos.add(clasico);
        listaautos.add(suv);
        
        while(opcion >0 && opcion <4){
        System.out.println("############### ELIJA UN VEHICULO #################");
        System.out.println("####1.Toyota (kms actuales : " + listaautos.get(0).motor.getKilometrosRecorridos() );
        System.out.println("####2.Volskwagen (kms actuales : " + listaautos.get(1).motor.getKilometrosRecorridos() );
        System.out.println("####3.Honda (kms actuales : " + listaautos.get(2).motor.getKilometrosRecorridos() );
        System.out.println("####0.Salir");
        System.out.print("Opcion ->");
        
        opcion = ingreso.nextInt();  
        
        if(opcion >0 && opcion<4 ){
        System.out.println("Ingrese kilometros recorridos para el " +  listaautos.get(opcion-1).getMarca() +
                 " " + listaautos.get(opcion-1).getModelo() +"( actuales "+ listaautos.get(opcion-1).motor.getKilometrosRecorridos()+")");
       
        dato = ingreso.nextInt();
  
        listaautos.get(opcion-1).avanzar(dato) ;
        
        }
    }
    
}
}
