package ensamblajecarros;

import creacional.Motor;
import creacional.VehiculoChevrolet;

public class ChevroletAveo extends VehiculoChevroletBuilder {

    @Override
    public void definirVehiculoChevrolet() {
        vehiculo = new VehiculoChevrolet(); 

        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("Aveo");
        vehiculo.setAlmacenamiento("1200 lb");
        vehiculo.setCarroceria("232JLK3");     
    }

    @Override
    public void definirMotor() {
        vehiculo.setMotor(new Motor("XMZ", 1.6));        
    }
    
}
