package ensamblajecarros;

import creacional.VehiculoChevrolet;

public class VehiculoChevroletDirector {
	
	public VehiculoChevroletBuilder builder;
	
	public VehiculoChevroletDirector( VehiculoChevroletBuilder builder) {
		this.builder=builder;
	}
	
	public void construir() {
		builder.definirVehiculoChevrolet();
		builder.definirMotor();
	}
	
	public VehiculoChevrolet getVehiculoChevrolet() {
		return builder.getVehiculoChevrolet();
	}
	

}
