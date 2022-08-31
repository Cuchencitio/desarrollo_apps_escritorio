
package demoherencia;
import demoherencia.DTO.Vehiculo;
public class Main {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        int ruedasSedan = 4;
        miVehiculo.setMarca("Toyota");
        miVehiculo.setModelo("Yaris");
        miVehiculo.setCantidadRuedas(ruedasSedan);
        String marca = miVehiculo.getMarca();
        String modelo = miVehiculo.getModelo();
        System.out.println(marca+ " "+ modelo + " " + miVehiculo.getCantidadRuedas());
    }
}
