package ensamblajecarros;

import creacional.VehiculoChevrolet;

public abstract class VehiculoChevroletBuilder {
	protected VehiculoChevrolet vehiculo;
	
	public VehiculoChevrolet getVehiculoChevrolet() {
		return vehiculo;
	}
	public abstract void definirVehiculoChevrolet();        
	public abstract void definirMotor();
}
