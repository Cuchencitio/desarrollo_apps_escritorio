/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase25_08;

import clase25_08.DTO.Vehiculo;

/**
 *
 * @author Cetecom
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehiculo vehiculo = new Vehiculo();
       vehiculo.setMarca("Honda");
       vehiculo.setModelo("Civic");
       vehiculo.setCantidadRuedas(4);
       vehiculo.setColor("Blanco");
    }
    
}
