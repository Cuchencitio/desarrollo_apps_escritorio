
package demoherencia.DTO;

public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Patente;
    private int CantidadRuedas;
    
    // Constructor: Define parametros predeterminados iniciales
    public Vehiculo(){
        this.Marca = "Chevrolet";
        this.Modelo = "Aveo";
        this.Patente = "Sin patente";
        this.CantidadRuedas = 4;
    }
    //GET
    public String getMarca(){
        return this.Marca;
    }
    // SET
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public String getPatente(){
        return this.Patente;
    }
    public int getCantidadRuedas(){
        return this.CantidadRuedas;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setPatente(String Patente){
        this.Patente = Patente;
    }
    public void setCantidadRuedas(int CantidadRuedas){
        this.CantidadRuedas = CantidadRuedas;
    }
}
