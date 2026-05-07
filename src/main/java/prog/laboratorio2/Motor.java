/*



 */
package prog.laboratorio2;

/**
 *
 * @author Alumno
 */
public class Motor {
    private int kmRecorridos;
    private final double cc;
    private final int hp;
    
    public Motor(int kilometrosRecorridos, double cilindrada, int caballosFuerza) {
        this.kmRecorridos = kilometrosRecorridos;
        this.cc = cilindrada;
        this.hp = caballosFuerza;
    }
    
    public boolean requiereCambioAceite(int km){
        return km > 100000;
    }
    
    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kmRecorridos = kilometrosRecorridos;
    }
    
    public int getKmRecorridos() {
        return kmRecorridos;        
    }
    
    public double getCilindrada() {
        return cc;
    }

    public int getCaballosFuerza() {
        return hp;
    }
}

