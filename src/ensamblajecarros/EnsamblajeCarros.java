 
package ensamblajecarros;
 
import creacional.VehiculoChevrolet;

public class EnsamblajeCarros {
    public static void main(String[] args) {
        System.out.println("***CHEVROLET SPARK***");	
        VehiculoChevroletDirector director1 = new VehiculoChevroletDirector(new ChevroletSpark());		
        director1.construir();
        VehiculoChevrolet apark = director1.getVehiculoChevrolet();		 
        System.out.println(apark.toString());

        System.out.println("***CHEVROLET SAIL***");
        VehiculoChevroletDirector director2 = new VehiculoChevroletDirector(new ChevroletSail());		
        director2.construir();
        VehiculoChevrolet sail = director2.getVehiculoChevrolet();		 
        System.out.println(sail.toString()); 

        System.out.println("***CHEVROLET AVEO***");
        VehiculoChevroletDirector director3 = new VehiculoChevroletDirector(new ChevroletAveo());		
        director3.construir();
        VehiculoChevrolet aveo = director3.getVehiculoChevrolet();		 
        System.out.println(aveo.toString());         
    }    
}
