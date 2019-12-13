 
package creacional;
 
public class Motor {
    
    private String marca;
    private double cilindraje;

    public Motor(String marca, double cilindraje) {
        this.marca = marca;
        this.cilindraje = cilindraje;
    }

    public Motor() {
    }

    @Override
    public String toString() {
        return "Motor{" + "marca=" + marca + ", cilindraje=" + cilindraje + '}';
    }
}
