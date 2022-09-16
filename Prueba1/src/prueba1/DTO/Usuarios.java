package prueba1.DTO;

import java.util.Date;

public class Usuarios {
    private int ID;
    private String Nombre;
    private int Rut;
    private String DV;
    private Date fNacimiento;
    private String Telefono;
    private String eMail;
    private String Usuario;
    private String Password;
    
    public Usuarios(){
        this.ID = 0;
        this.Nombre = "";
        this.Rut = 0;
        this.DV = "";
        this.fNacimiento = new Date();
        this.Telefono = "";
        this.eMail = "";
        this.Usuario = "";
        this.Password = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int anio, int mes, int dia) {
        if(anio < 2004){
            this.fNacimiento = new Date(anio-1900, mes-1,dia);
        }else{
            System.out.println("Debes ser mayor de edad para registrate");
        }
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        if(Telefono.startsWith("56") && Telefono.length() > 10){
            this.Telefono = Telefono;
            System.out.println("Numero de telefono agregado de manera exitosa");
        }else{
            System.out.println("Numero de telefono invalido");
        }
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        if(eMail.contains("@")){
            if(eMail.contains(".com") || eMail.contains(".cl")){
                this.eMail = eMail;
                System.out.println("Email Valido");
            }else{
                System.out.println("Debes ingresar un eMail valido");
            }
        }
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        if (Usuario.length() >= 4){
            this.Usuario = Usuario;
            System.out.println("Usuario Valido");
        }else{
            System.out.println("Usuario invalido");
        }
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        for (int i = 0; i < Password.length(); i++) {
                if (Character.isUpperCase(Password.charAt(i)) && Password.matches(".*\\d.*")) {
                this.Password = Password;
                System.out.println("Contrasena Valida");
                break;
            }else{
                System.out.println("Constrasena invalida"); 
                break;
            }
        }
    }
    public void Login(String Username, String Password){
        if (this.Usuario.contains(Username) && this.Password.contains(Password)){
            System.out.println("Nombre de usuario y contrasena correctos");
        }else{
            System.out.println("Nombre de usuario o contrasena incorrectos");
        }
    }
    public void changePassword(String Usuario, String newPassword){
        if(this.Usuario.contains(Usuario)){
            System.out.println("Usuario Validado");
            for (int i = 0; i < newPassword.length(); i++) {
                if (Character.isUpperCase(newPassword.charAt(i)) && newPassword.matches(".*\\d.*")) {
                    this.Password = newPassword;
                    System.out.println("Contrasena Temporal seteada con exito");
                    break;
                }else{
                    System.out.println("Nueva constrasena invalida"); 
                    break;
                }
            }
        }else{
            System.out.println("Usuario no encontrado");
        }
    }
}