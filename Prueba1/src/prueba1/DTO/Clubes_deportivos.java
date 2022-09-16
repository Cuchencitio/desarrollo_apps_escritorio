package prueba1.DTO;

public class Clubes_deportivos {
    private String Codigo;
    private String nombreClub;
    private String nombreFundador;
    private int anioFundacion;
    private String paisOrigen;
    private String Lema;
    private String Colores;
    private int valorSuscripcion;
    private String Deporte;
    
    public Clubes_deportivos(){
        this.Codigo = "";
        this.nombreClub = "";
        this.nombreFundador = "";
        this.anioFundacion = 0;
        this.paisOrigen ="";
        this.Lema = "";
        this.Colores = "";
        this.valorSuscripcion = 0;
        this.Deporte = "Handball";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Correlativo) {
        this.Codigo = this.nombreClub.substring(0, 2).toUpperCase() + this.Deporte.substring(0,1) + Correlativo;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreFundador() {
        return nombreFundador;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombreFundador = nombreFundador;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = valorSuscripcion;
    }
    public void agregarColores(String Color){
        if(this.Colores != ""){
            this.Colores = this.Colores + ", ";
        }
        this.Colores = this.Colores + Color;
    }
    public void cambiarNombre(String nuevoNombre, int Correlativo){
        this.nombreClub = nuevoNombre;
        this.setCodigo(Correlativo);
    }
}
