package ensamblajecarros;

import creacional.VehiculoChevrolet;
import creacional.Motor;

public class ChevroletSail extends VehiculoChevroletBuilder{    
	@Override
	public void definirVehiculoChevrolet() {
                vehiculo = new VehiculoChevrolet(); 
                
		vehiculo.setMarca("Chevrolet");
		vehiculo.setModelo("Sail");
		vehiculo.setAlmacenamiento("1000 lb");
		vehiculo.setCarroceria("1J23K023"); 
	}
	@Override
	public void definirMotor() {
                vehiculo.setMotor(new Motor("XYZ", 1.4));
	} 	
}
