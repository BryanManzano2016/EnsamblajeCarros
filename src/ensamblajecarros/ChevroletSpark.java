package ensamblajecarros;

import creacional.VehiculoChevrolet;
import creacional.Motor;

public class ChevroletSpark extends VehiculoChevroletBuilder{
	@Override
	public void definirVehiculoChevrolet() {
                vehiculo = new VehiculoChevrolet();
                
                vehiculo.setMarca("Chevrolet");
                vehiculo.setModelo("Spark");
		vehiculo.setAlmacenamiento("500 lb");
		vehiculo.setCarroceria("JWE9EWF8"); 
	}
	@Override
	public void definirMotor() {
                vehiculo.setMotor(new Motor("ABC", 1.2));
	} 	
}
