 
package creacional;

public class VehiculoChevrolet {
    
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String carroceria;
    private Motor motor;

    public VehiculoChevrolet(String marca, String modelo, Motor motor, String almacenamiento, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.almacenamiento = almacenamiento;
        this.carroceria = carroceria;
    }

    public VehiculoChevrolet() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "VehiculoChevrolet{" + "marca=" + marca + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento + ", carroceria=" + carroceria + ", motor=" + motor + '}';
    }
}
