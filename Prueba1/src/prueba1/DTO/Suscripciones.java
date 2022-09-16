package prueba1.DTO;

import java.util.Date;

public class Suscripciones extends Clubes_deportivos{
    private Date fechaInicio;
    private int Valor;
    private String Equipos;
    private int abonoTotal;
    private int Correlativo;
    private int Folio;
    
    public Suscripciones(){
        this.fechaInicio = new Date();
        this.Valor = 0;
        this.Equipos = "";
        this.abonoTotal = 0;
        this.Correlativo = 0;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int anio, int mes, int dia) {
        this.fechaInicio = new Date(anio-1900, mes-1,dia);
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos (String Codigo, int Valor) {
        this.Equipos = Codigo + " $" + Valor + ";";
        this.Equipos = this.Equipos + this.Equipos;
    }

    public int getAbonoTotal() {
        return abonoTotal;
    }

    public void setAbonoTotal(int abonoTotal) {
        this.abonoTotal = this.abonoTotal + abonoTotal;
    }

    public int getCorrelativo() {
        return Correlativo;
    }

    public void setCorrelativo(int Correlativo) {
        this.Correlativo = Correlativo;
    }
    public int getFolio(){
        return this.Folio;
    }
    public void setFolio(int Numero){
        this.Folio = Numero;
    }   
    public void Suscribirce(int ano, int mes, int dia, int Valor, String Equipos, int AbonoTotal, int ValorSuscripcion, int Folio){
        this.setFechaInicio(ano, mes, dia);
        this.setValor(Valor);
        if(this.Equipos.contains(Equipos)){
        }else{
            this.setEquipos(Equipos, ValorSuscripcion);
        }        
        this.setAbonoTotal(AbonoTotal);
        this.setFolio(Folio);
    }
    public void detalleSuscripcion(){
        System.out.println("Fecha de inicio de suscripcion: " + this.fechaInicio);
        System.out.println("Valor de la suscripcion: " + this.Valor);
        System.out.println("Equipos: " + this.Equipos);
        System.out.println("Abono Total: " + this.abonoTotal);
        System.out.println("Folio: "  + this.Folio);
    }
}
