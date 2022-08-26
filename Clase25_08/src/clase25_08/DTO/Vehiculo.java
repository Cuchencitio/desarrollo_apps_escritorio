/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase25_08.DTO;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String Modelo;
    private String Marca;
    private String Color;
    private int cantidadRuedas;        

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getColor() {
        return Color;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }
}
