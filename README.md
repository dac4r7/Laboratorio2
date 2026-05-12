# Concesionaria de Autos
La concesionaria “AutoMG” desea comenzar el desarrollo de un sistema para gestionar sus vehículos.

Se solicita implementar un modelo básico utilizando composición de objetos.

## Requisitos:
* Clase Motor
## Atributos:
* kilometrosRecorridos
* cilindrada (por ejemplo: 1.6, 2.0, etc.)
* caballosFuerza
## Métodos:
```
requiereCambioAceite():
Devuelve true si los kilómetros recorridos superan los 100.000 km, en caso contrario devuelve false.
```

* Clase Auto
## Atributos:
* marca
* modelo
* color
* Motor motor (composición)
* precio
## Métodos:
```
avanzar(int km):
Incrementa los kilómetros recorridos del motor.
```
```
Invoca el método requiereCambioAceite() del motor.
Si devuelve true, mostrar un mensaje con JOptionPane.showMessageDialog
indicando que el auto necesita cambio de aceite.
```
## Clase Principal (Main)
  
Crear un ArrayList<Auto> con al menos 3 autos distintos.

Simular el avance de los autos con distintos valores de kilómetros (por ejemplo: 30.000, 50.000, 25.000).
Mostrar la información de cada auto (puede ser por consola o usando JOptionPane).
